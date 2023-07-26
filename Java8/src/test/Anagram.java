package test;

import java.util.Arrays;

public class Anagram {
	
	public static boolean checkAnagram(String str1,String str2) {
		int n1=str1.length();
		int n2=str2.length();
		if(n1!=n2) return false;
		
	char[] c1=str1.toCharArray();
	char[] c2=str2.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	for(int i=0;i<n1;i++)
		if(c1[i]!=c2[i]) 
			return false;
	
	return true;
		
	}
public static void main(String[] args) {
	String str1="Prashanth Motupalli";
	String str2="Motupalli Prashanth Y";
	
	if(checkAnagram(str1,str2))
		System.out.println("Anagram");
	else
		System.out.println("Not Anagram");
}
	
}
