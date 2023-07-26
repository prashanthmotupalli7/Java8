package test;

import java.util.HashMap;
import java.util.Map;

public class duplicateCharcount {
	
	public static void printDuplicateCharacters(String str)
	{
		Map<Character,Integer> charCount=new HashMap<>();
		for(char c: str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
		}
		
		System.out.println("Printing Duplicate character");
		for(Map.Entry<Character,Integer> entry:charCount.entrySet())
			if(entry.getValue()>1)
				System.out.println(entry.getKey()+" : "+entry.getValue());
	}
	
	//print duplicates in sentence
	public static void printDuplicateWords(String str) {
		String[] words=str.split(" ");
		Map<String,Integer> wordsCount=new HashMap<String, Integer>();
		for(String word:words) {
			String  wordLowerCase = word.toLowerCase();
			wordsCount.put(wordLowerCase, wordsCount.getOrDefault(wordLowerCase, 0)+1);
	}
		System.out.println("Printing Duplicates");
		for(String word:wordsCount.keySet()) {
			int frequency=wordsCount.get(word);
			if(frequency>1) {
				System.out.println(word+" "+frequency);
			}
			
		}
	}
	public static void main(String[] args) {
		String str="Prashanth Motupalli";
		String str2="Rain rain go away come again o another day";
		printDuplicateCharacters(str);
		printDuplicateWords(str2);
		
	}

}
