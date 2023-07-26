package test;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {
	public static void main(String[] args) {
	int a[]= {1,1,3,2,1,5,6,7,8,2};
	Set<Integer> set =new HashSet<>();
	Set<Integer> ans =new HashSet<>();
	for(int arr:a) {
		if(set.contains(arr)) 
			ans.add(arr);
		else
			set.add(arr);
	}
	System.out.println(ans);

	
	
	
	
	
	
	        }
	    }
