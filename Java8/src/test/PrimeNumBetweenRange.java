package test;

import java.util.Scanner;

public class PrimeNumBetweenRange {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.print("Enter lower number :  ");
		int low=sc.nextInt();
		System.out.print("Enter upper number :  ");
		int upper=sc.nextInt();
		int i;
		int j;
		for( i=low;i<=upper;i++) {
			for( j=2;j<=upper;j++) {
				if(i%j==0)
					break;
			}
		    if(i==j)
		    	System.out.print(j+" ");
	}

}
}