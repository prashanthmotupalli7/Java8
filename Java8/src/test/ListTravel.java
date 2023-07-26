package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTravel {
	public static void main(String[] args) {
		
		List<String> ListStr=new ArrayList<>();
		ListStr.add("Ram");
		ListStr.add("Sita");
		ListStr.add("Lakshman");
		ListStr.add("Hanuman");
		ListStr.add("Ravana");
//for Loop
for(int i=0;i<ListStr.size();i++)
	System.out.print(ListStr.get(i)+" ");
//forEach
for(String str:ListStr)
	System.out.print(str+" ");
//iterator
Iterator<String> itr=ListStr.iterator();
while(itr.hasNext()) {
	String element=itr.next();
	System.out.print(element+" ");
}
//listIterator
ListIterator<String> listIterator=ListStr.listIterator();
while(listIterator.hasNext()) {
	String next=listIterator.next();
	System.out.print(next+" ");
}
System.out.println();
System.out.println("Using backword");
ListIterator<String> listIterator2=ListStr.listIterator(ListStr.size());
while(listIterator2.hasPrevious()) {
	String previous=listIterator2.previous();
	System.out.print(previous+" ");
}
System.out.println();
System.out.println("Using Lambda Expression");
ListStr.forEach(System.out::println);


		
	}

}
