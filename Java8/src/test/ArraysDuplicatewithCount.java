package test;

import java.util.HashMap;
import java.util.Map;

public class ArraysDuplicatewithCount {
public static void main(String[] args) {
	
	int a[]= {1,2,1,2,1,2,5,5,5,4,2,3,4,7,89,3,4,6,7,9};
	
	Map<Integer,Integer> countMap=new HashMap<>();
	for(int num:a) {
		if(countMap.containsKey(num)) {
			countMap.put(num, countMap.get(num)+1);
		}
	 else {
				countMap.put(num, 1);
			}
		
		}
	
	System.out.println("Printing Duplicates and their count");
	for(Map.Entry<Integer, Integer>  entry :countMap.entrySet()) {
		if(entry.getValue()>1)
			System.out.println(entry.getKey()+" : "+entry.getValue());
	}
	}
}
