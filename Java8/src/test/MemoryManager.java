package test;
import java.util.*;

class MemoryManager {
    private final int totalBlockCount;
    private final Map<String, List<MemoryBlock>> processAllocations;

    public MemoryManager(int totalBlockCount) {
        this.totalBlockCount = totalBlockCount;
        this.processAllocations = new HashMap<>();
    }

    public String allocate(String process, String variable, int blocksRequested, boolean requireContiguousFlag) {
        if (blocksRequested <= 0 || blocksRequested > totalBlockCount / 4) {
            return "error " + getAllocatedSpace() + " / " + getFreeSpace();
        }

        int freeBlocks = getFreeSpace();
        if (freeBlocks < blocksRequested) {
            return "error " + getAllocatedSpace() + " / " + getFreeSpace();
        }

        if (requireContiguousFlag) {
            List<MemoryBlock> allocatedBlocks = allocateContiguousBlocks(blocksRequested);
            if (allocatedBlocks == null) {
                return "error " + getAllocatedSpace() + " / " + getFreeSpace();
            }
            processAllocations.put(variable, allocatedBlocks);
        } else {
            processAllocations.put(variable, allocateNonContiguousBlocks(blocksRequested));
        }

        return "success " + getAllocatedSpace() + " / " + getFreeSpace();
    }

    private List<MemoryBlock> allocateContiguousBlocks(int blocksRequested) {
        List<MemoryBlock> allocatedBlocks = new ArrayList<>();
        int startingBlock = 0;
        int contiguousBlocks = 0;

        while (startingBlock < totalBlockCount) {
            if (!isBlockAllocated(startingBlock)) {
                contiguousBlocks++;
                if (contiguousBlocks == blocksRequested) {
                    allocateBlocks(allocatedBlocks, startingBlock - blocksRequested + 1, startingBlock);
                    return allocatedBlocks;
                }
            } else {
                contiguousBlocks = 0;
            }
            startingBlock++;
        }

        return null;
    }

    private List<MemoryBlock> allocateNonContiguousBlocks(int blocksRequested) {
        List<MemoryBlock> allocatedBlocks = new ArrayList<>();
        int allocatedCount = 0;
        int currentBlock = 0;

        while (allocatedCount < blocksRequested) {
            if (!isBlockAllocated(currentBlock)) {
                allocateBlock(allocatedBlocks, currentBlock);
                allocatedCount++;
            }
            currentBlock++;
        }

        return allocatedBlocks;
    }

    private void allocateBlock(List<MemoryBlock> allocatedBlocks, int blockNumber) {
        allocatedBlocks.add(new MemoryBlock(blockNumber));
    }

    private void allocateBlocks(List<MemoryBlock> allocatedBlocks, int startBlock, int endBlock) {
        for (int i = startBlock; i <= endBlock; i++) {
            allocateBlock(allocatedBlocks, i);
        }
    }

    public String free(String process, String variable) {
        List<MemoryBlock> freedBlocks = processAllocations.remove(variable);
        if (freedBlocks == null) {
            return "error " + getAllocatedSpace() + " / " + getFreeSpace();
        }

        return "success " + getAllocatedSpace() + " / " + getFreeSpace();
    }

    public String kill(String process) {
        Iterator<Map.Entry<String, List<MemoryBlock>>> iterator = processAllocations.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<MemoryBlock>> entry = iterator.next();
            if (entry.getKey().startsWith(process)) {
                iterator.remove();
            }
        }

        return "success " + getAllocatedSpace() + " / " + getFreeSpace();
    }

    public String inspect(String process) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, List<MemoryBlock>> entry : processAllocations.entrySet()) {
            if (entry.getKey().startsWith(process)) {
                result.append(entry.getKey()).append(" ").append(getBlockRange(entry.getValue())).append("\n");
            }
        }

        return result.toString().trim();
    }

    private String getBlockRange(List<MemoryBlock> allocatedBlocks) {
        if (allocatedBlocks.size() == 0) {
            return "";
        }

        int startBlock = allocatedBlocks.get(0).getBlockNumber();
        int endBlock = allocatedBlocks.get(allocatedBlocks.size() - 1).getBlockNumber();
        return startBlock + "-" + endBlock;
    }

    private int getAllocatedSpace() {
        return processAllocations.values().stream().mapToInt(List::size).sum();
    }

    private int getFreeSpace() {
        return totalBlockCount - getAllocatedSpace();
    }

    private boolean isBlockAllocated(int blockNumber) {
        for (List<MemoryBlock> allocatedBlocks : processAllocations.values()) {
            for (MemoryBlock block : allocatedBlocks) {
                if (block.getBlockNumber() == blockNumber) {
                    return true;
                }
            }
        }
        return false;
    }
}

class MemoryBlock {
    private final int blockNumber;

    public MemoryBlock(int blockNumber) {
        this.blockNumber = blockNumber;
    }

    public int getBlockNumber() {
        return blockNumber;
    }
}
