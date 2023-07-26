package test;

public class SubArraySumK {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		int result = 0;
		int n = a.length;
		int k = 3;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum = sum + a[j];
				if (sum == k)
					result++;
			}
		}

		System.out.println("Number of sub array whose sum is " + k + " is " + result);
	}
}
