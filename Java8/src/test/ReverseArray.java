package test;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
       int a[]= {1,2,3,4,5};
		/*
		 * for(int i=a.length-1;i>=0;i--) System.out.print(a[i]+" ");
		 */
      //another method
      for(int i=0;i<a.length/2;i++) {
    	   int j = a[i];
           a[i]=a[a.length-i-1];
           a[a.length-i-1]=j;
      }

      System.out.print("Reversed array "+Arrays.toString(a));
	}
}