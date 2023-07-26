package test;
public class MemoryManagerMain {
    public static void main(String[] args) {
        MemoryManager memoryManager = new MemoryManager(100);

        System.out.println(memoryManager.allocate("P1", "var_x", 1000, false));
        System.out.println(memoryManager.allocate("P1", "var_x", 10, false));
        System.out.println(memoryManager.allocate("P2", "var_y", 25, true));
        System.out.println(memoryManager.free("P1", "var_x"));
        System.out.println(memoryManager.kill("P2"));
        System.out.println(memoryManager.allocate("P1", "var_z", 10, true));
        System.out.println(memoryManager.allocate("P4", "var_x", 5, true));
        System.out.println(memoryManager.allocate("P1", "var_w", 5, true));
        System.out.println(memoryManager.free("P4", "var_x"));
        System.out.println(memoryManager.allocate("P1", "var_y", 6, true));
        System.out.println(memoryManager.inspect("P1"));
    }
}
