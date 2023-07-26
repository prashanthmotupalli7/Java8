package test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) {
		
		String s="Java Java Hello World";
		String[] str=s.split(" ");
		
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(str)); // Store unique words

        StringBuilder result = new StringBuilder();
        for (String strr : uniqueWords) {
            result.append(strr).append(" ");
            
        }

System.out.println(result);		
		
			
			}
		
	}

