package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSum8 {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(11,12,13,14,15,16,17,18,19,20);
	int sum=list.stream().filter(s->s%2==0).mapToInt(Integer::valueOf).sum();
	System.out.println(sum);
	
	//String to capital letters
	List<String> words=Arrays.asList("apple","banana","orange","grapes");
	List<String> WordsToCapital=words.stream().map(String::toUpperCase).collect(Collectors.toList());
	List<String> firstLetterToCap=words.stream().map(s->s.substring(0,1).toUpperCase()+s.substring(1))
			.collect(Collectors.toList());
	System.out.print(WordsToCapital+" ");
	System.out.println("\n");
	System.out.println(firstLetterToCap);
}
}
