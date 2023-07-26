package test;

import java.util.function.Function;

public class LamdaExpressions {

	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i*i;
		System.out.println("the square of a number "+f.apply(5));

	}

}
