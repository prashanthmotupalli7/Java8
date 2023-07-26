package test;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamEmpB {
	public static void main(String[] args) {
		ArrayList<String> emp=new ArrayList<>();
		emp.add("Ravi");
		emp.add("Bhanu");
		emp.add("Dhevi");
		emp.add("Bunty");
		emp.add("Likith");
		
		String result=emp.stream().filter(s->s.startsWith("B")).collect(Collectors.joining(" "));
		System.out.println(result);
	emp.stream().filter(s->s.startsWith("B")).forEach(System.out::println);
	 
	Long countofEmpwithB=	emp.stream().filter(s->s.startsWith("B")).collect(Collectors.counting());
	System.out.println("Employee count name start with B : "+countofEmpwithB);
		
	}

}
