package test;

import java.util.Arrays;
import java.util.List;

class StreamsNumberStartsWith1{
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,4,5,14,17,19,1,87,10);
		list.stream()
		.map(String::valueOf)
		.filter(s->s.startsWith("1"))
		.forEach(System.out::println);
		
		int arr[]= {1,2,3,4,5};
		int sumOfarr = Arrays.stream(arr).sum();
		System.out.println("print sum of array : "+sumOfarr);
		
		
		System.out.println("Printing occurence evenbeforeodd");
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int index=0;
		int aa[]=new int[a.length];
		//add all even occurences
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				aa[index]=a[i];
				index++;
			}
		}
		//add all odd occurences
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				aa[index]=a[i];
				index++;
			}
		}
			for(int i=0;i<aa.length;i++)
				System.out.print(aa[i]+" ");
	
	
	}

}
		