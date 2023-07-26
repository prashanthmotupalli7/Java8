package test;

public class RemoveDuplicateInSortedArray {
		
	    public static int removeDuplicates(int[] nums) {
	    if (nums == null || nums.length == 0) {
	        return 0; // Empty array if input is null or empty
	    }

	    int n = nums.length;
	    int count = 1; // Keep track of the unique elements count
	    int i = 1; // Pointer for iterating through the array

	    // Iterate through the array
	    while (i < n) {
	        if (nums[i] != nums[i - 1]) {
	            nums[count] = nums[i]; // Move the unique element to the next position
	            count++; // Increment the count of unique elements
	        }
	        i++; // Move to the next element
	    }

	    // Modify the original array to have unique elements and fill remaining positions with placeholders
	    for (int j = count; j < n; j++) {
	        nums[j] = -1; // Use a placeholder value, or you can set it to any other appropriate value
	    }

	    return count;
	}
public static void main(String[] args) {
	int nums[]= {1,1,2,2,3,3,4,4,5,6,7,7};
	//removeDuplicates(nums);
	
	 // int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

      System.out.println("Original array:");
      printArray(nums);

      int uniqueCount = removeDuplicates(nums);

      System.out.println("Modified array:");
      printArray(nums);

      System.out.println("Count of unique elements: " + uniqueCount);
  }



  public static void printArray(int[] nums) {
      for (int num : nums) {
          System.out.print(num + " ");
      }
      System.out.println();
  }
}
	        
	    

