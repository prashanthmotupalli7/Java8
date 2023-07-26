package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinWordsInList {
public static void main(String[] args) {
	List<String> quote=Arrays.asList("Looking","for","hope","in","hopeless","situation");
	String qote=quote.stream().collect(Collectors.joining(" "));
	System.out.println(qote);
}
}
