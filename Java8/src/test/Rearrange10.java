package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Rearrange10 {

	public static void main(String[] args) {

		int[] a = { 1, 0, 1, 0, 1, 0 };
		int n = a.length;
		int sumArray = Arrays.stream(a).sum();
		OptionalDouble avg = Arrays.stream(a).average();

		System.out.println("Sum of array elements " + sumArray);
		System.out.println("Average of array elements " + avg);
		Integer[] sortedArray = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);

		// convert Integer array to int array
		int[] array = Arrays.stream(sortedArray).mapToInt(Integer::intValue).toArray();
		System.out.println("Reverse Order using Java 8 : " + Arrays.toString(array));

		a = Arrays.stream(a).sorted().toArray();
		System.out.println("Sorted Array : " + Arrays.toString(a));
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.print("Sorted array " + Arrays.toString(a) + "         ");
		for (int element : a)
			System.out.print(element + " ");

		System.out.println("ARRRAY  STRING OPERATIONS ");
		String[] names = { "projectk", "salar", "aadhipursh", "rajadelux" };
		String str = "rajadelux";
		int index = IntStream.range(0, names.length).filter(i -> str.equals(names[i])).findFirst().orElse(-1);
		if (index != -1)
			System.out.println("element found at " + index);
		else
			System.out.println("element not found");
		
		//printing an elements whose length>4
	List<String> nameLengthGreater5=Arrays.stream(names).filter(s->s.length()>5).collect(Collectors.toList());
	System.out.println("Names Length greater than 5 "+nameLengthGreater5);
		Arrays.sort(names);
		String[] reverseSortStr = Arrays.stream(names).sorted(Comparator.reverseOrder()).toArray(String[]::new);
		System.out.println("Printing String array in reverseOrder : " + Arrays.toString(reverseSortStr));
		System.out.println("String array in order" + Arrays.toString(names));
	}
}
