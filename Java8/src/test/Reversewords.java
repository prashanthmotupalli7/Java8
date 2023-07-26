package test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Reversewords {
	
	public static void main(String[] args) {
		
		String str="Prashanth is going to crack the interview";
		String splitArray[]=str.split(" ");  //("\\s+")--> rmove white space
		for(int i=splitArray.length-1;i>=0;i--)
			System.out.print(splitArray[i]+" ");
		
		 String result =Arrays.stream(splitArray).map(word->new StringBuilder(word).reverse().toString()
				 )
		.collect(Collectors.joining(" "));
		System.out.println("Reversing using stream API");
		System.out.println(result);
}

}
