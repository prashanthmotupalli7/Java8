package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {
	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2=Arrays.asList(4,5,6,7,8);
		List<Integer> mergeList=Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		System.out.println(mergeList);
	List<Integer> uniqueElement=mergeList.stream().distinct().collect(Collectors.toList());
	System.out.println(uniqueElement);
	int min=uniqueElement.stream().min((x1,x2)->x1-x2).get();
	int max=uniqueElement.stream().max((x1,x2)->x1-x2).get();
	System.out.println(" MAX :"+max+" "+"MIN :"+min);

	
	}

}
