package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateAL {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		List<Integer> l=Arrays.asList(1,2,3,4,5,7,3,1,8,9);
		al.addAll(l);
		
		lhs.addAll(al);
		al.clear();
		al.addAll(lhs);
		System.out.println(al);
		
		/*
		 * //Using Stream API //int arr[]= {1,3,2,4,2,5,1,89,21,15,5}; //Integer[]
		 * uniqueElements=Arrays.stream(arr).distinct().(Integer[]::new);
		 * 
		 * //System.out.println(uniqueElements.toString());
		 */	}
	
}
