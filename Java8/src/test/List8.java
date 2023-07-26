package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class List8 {
public static void main(String[] args) {
	
	List<Integer> num=Arrays.asList(11,22,14,33,25,28,37,13,77,29,18);
	
	List<Integer> numSort=num.stream().sorted(Comparator.naturalOrder()).toList();
	System.out.println("sorting list of numbers: "+numSort);
	
	List<Integer> numSortRev=num.stream().sorted(Comparator.reverseOrder()).toList();
	System.out.println("sorting list of numbers in descending order: "+numSortRev);

	
	List<Integer> evenList=num.stream().filter(i->i%2==0).toList();
	System.out.println(evenList);
	
	List<Integer> oddList=num.stream().filter(i->i%2!=0).toList();
	System.out.println(oddList);
	
	Long countList=num.stream().count();
	System.out.println("number of elements in list :"+countList);
	
	List<Integer> multiplywith5=num.stream().map(i->i*5).toList();
	System.out.println("multiplying each element with 5 "+multiplywith5);
	
	int max=num.stream().max(Integer::compare).get();
	int min=num.stream().min(Integer::compare).get();
	System.out.println("MAX :"+max+" "+"MIN :"+min);
	
	List<Integer> numStart1=num.stream().
			map(String::valueOf).filter(i->i.startsWith("1")).map(Integer::parseInt).collect(Collectors.toList());
	System.out.println("Number starts with 1 "+numStart1 );
	
	List<Integer> numEndswith8=num.stream().
			map(String::valueOf).filter(i->i.endsWith("8")).map(Integer::parseInt).collect(Collectors.toList());
       System.out.println("Number ends with  "+numEndswith8);
       
   	List<String> str=Arrays.asList("bahubali","bhalaldeva","devasena","avanthika","kattapa","sivagaami","Kalakeya","bijjaladeva");
 
   	List<String> strStartwithB=str.stream().filter(i->i.startsWith("b")).collect(Collectors.toList());
   	System.out.println("String starts with B : "+strStartwithB);
	

   	List<String> sortRev=str.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
   	System.out.println("sorting string : "+sortRev);
}
}
