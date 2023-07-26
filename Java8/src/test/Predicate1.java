package test;

import java.util.function.Predicate;

public class Predicate1 {
public static void main(String[] args) {
	Predicate<Integer> p=i->i%2==0;
	System.out.println("test given number is even "+p.test(45));
}
}
