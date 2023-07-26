package test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateString {
	public static void main(String[] args) {
		String str="Prashanth Motupalli";
		
		String result=str.chars().distinct().mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
		System.out.println(result);
		System.out.println(removeDuplicate(str));
	}
	
	static  String removeDuplicate(String str) {
		Set<Character> set=new HashSet<>();
		StringBuffer sf=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			Character c=str.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
			    sf.append(c);
			}
				
		
	}
		return sf.toString();

}
}