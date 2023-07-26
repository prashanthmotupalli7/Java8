package test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

interface  Interf1{
	public int squareIt(int n);
}
public class FI2 {
	public static void main(String[] args) {
		Interf1 i=n->n*n;
		System.out.println("Square of number "+i.squareIt(5));
		
		//find first word starts with bin given list 
		List<String> str=Arrays.asList("apple","banana","grapes","blueberry");
	Optional<String> firstWord=	str.stream().filter(s->s.startsWith("b")).findFirst();
	System.out.println(firstWord);
		
		List<Integer> list= Arrays.asList(2,4,6,8,16);
		int count =0;

			for(int i1=0;i1<list.size();i1++) {
				if(list.get(i1)%2!=0)
					count++;
				}
				if(count>0)
					System.out.println("List wont contain all even elements");
				else
					System.out.println("List contain all even numbers");
		}
		
	}


