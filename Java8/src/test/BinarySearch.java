package test;

public class BinarySearch {
	
	 int binarySearch(int array[], int element, int low, int high) {

		    if (high >= low) {
		      int mid = low + (high - low) / 2;

		      // check if mid element is searched element
		      if (array[mid] == element)
		        return mid;

		      // Search the left half of mid
		      if (array[mid] > element)
		        return binarySearch(array, element, low, mid - 1);
		      else

		      // Search the right half of mid
		      return binarySearch(array, element, mid + 1, high);
		    }

		    return -1;
		  }
	public static void main(String[] args) {
		BinarySearch b=new BinarySearch();
		int arr[]= {34,67,43,58,33,2,90};
		int element=33;
		int result=b.binarySearch(arr, element, 0, arr.length);
		if(result==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at "+result+" index");
	}

}
