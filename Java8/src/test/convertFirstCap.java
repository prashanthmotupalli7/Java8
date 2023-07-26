package test;

import java.util.ArrayList;

public class convertFirstCap {
	public static void main(String[] args) {
		ArrayList<String> emp=new ArrayList<>();
		emp.add("ravi");
		emp.add("bhanu");
		emp.add("dhevi");
		emp.add("bunty");
		emp.add("likith");
		emp.stream().map(String::toUpperCase)
		.forEach(System.out::println);
		System.out.println("_______________________________");
		emp.stream()
		.map(s->s.substring(0, 1).toUpperCase()+s.substring(1))
		.forEach(System.out::println);
	}

}
