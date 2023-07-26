package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToFindPrime {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 3, 89, 77, 34, 63, 79, 111);
   List<Integer> primeNumbers= numbers.stream()
        .filter(StreamToFindPrime::isPrime)
        .collect(Collectors.toList());
   
   List<Integer> evenNumbers=numbers.stream()
	        .filter(i->i%2==0)
	        .collect(Collectors.toList());
   List<Integer> oddNumbers=numbers.stream()
	        .filter(i->i%2!=0)
	        .collect(Collectors.toList());
    
        System.out.print("Prime Numbers :"+primeNumbers+"\n");
        System.out.print("Even Numbers :"+evenNumbers+"\n");
        System.out.print("Odd Numbers :"+oddNumbers);


	}
		public static boolean isPrime(int number) {
			for(int i=2;i<=Math.sqrt(number);i++) {
				if(number%i==0) {
					return false;
			}
			
		}
			return true;
	}

}
