package test;

import java.util.Arrays;

public class ArrayMax {
	public static void main(String[] args) {
		int arr[]= {22,2,3,4,5,9,34,54,28,44,19};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) 
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		
		System.out.println("Maximum element in array "+max);
		System.out.println("Minimum element in array "+min);
		
		//nth largest and nth smallest element
		int a[]= {22,44,33,11,07,45,27,38,17};
		Arrays.sort(a);
		int n=3;
		int nthLargest=a[a.length-n];
		int nthSmallest=a[n-1];
		System.out.println("N_SMALL: "+nthSmallest);
		System.out.println("N_MAX: "+nthLargest);
		System.out.println("Sorting an array");
		//sort an array
		int b[]= {1,5,6,39,34,4,23,8,17};
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]>b[j]) {
				 int temp = b[i];
				 b[i]=b[j];
				 b[j]=temp;
				
				
			}
		}
			
			System.out.print(b[i]+" ");
		}
	}
}


