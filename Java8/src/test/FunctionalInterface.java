package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

interface Interf{
	public int m1(int a,int b);
}

public class FunctionalInterface {
	public static void main(String[] args) {
		
	List<Integer> num= Arrays.asList(1,2,3,5,6,5,9,7,8,9,10);
	num.stream().filter(n->n%2==0).forEach(System.out::println);
	Set<Integer> hs=new HashSet<>();
	num.stream().filter(n->!hs.add(n)).forEach(System.out::println);
	num.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	
	/*
	 * Interf i=(a,b)->(a+b); System.out.println(i.m1(1,2));
	 */
}
}