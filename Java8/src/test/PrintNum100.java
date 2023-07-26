package test;

public class PrintNum100 {

	public static void printNum(int n) {
		if(n<=100) {
			System.out.println(n);
			printNum(n+1);
		}
	}
	public static void main(String[] args) {
		printNum(1);
	}
}
