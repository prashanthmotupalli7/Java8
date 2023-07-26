package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLength {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("bunny","sunny","dev","pooja","revathi");
		Map<Integer,List<String>> wordsLength=words.stream().collect(Collectors.groupingBy(String::length));
		System.out.println("Grouped words with length : "+wordsLength);
		
		//stream()==
	}

}
