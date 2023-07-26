package test;

import java.util.Arrays;

public class RemoveElementArray {
	

	public static int[] removeElement(int[] array,int elementRemoved) {
		int[] newArray=new int[array.length-1];
		int index=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]!=elementRemoved) {
				newArray[index]=array[i];
				index++;
			
	}
		}
		return newArray;
	
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int elementRemoved=3;
		int[] newArray=removeElement(arr,elementRemoved);
		System.out.println(Arrays.toString(newArray));
	}
	
}
