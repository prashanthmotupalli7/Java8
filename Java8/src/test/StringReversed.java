package test;

public class StringReversed {
	public static void main(String[] args) {
		
	
	//first approach
	
	String str="Prashanth Motupalli";
	StringBuilder sb=new StringBuilder(str);
	String reverseString =sb.reverse().toString();
	System.out.println("Reverse of string : " +reverseString);
	
	//Second approach
	char[] charArray=str.toCharArray();
	StringBuilder sb1=new StringBuilder();
	for(int i=charArray.length-1;i>=0;i--)
		sb1.append(charArray[i]);
	String str1=sb.toString();
	System.out.println("Reverse String in second approach : "+str1);
	
}
}