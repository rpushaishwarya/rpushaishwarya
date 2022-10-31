package week2.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1="race";
		String text2="care";
		if(text1.length()==text2.length()) {
			char [] CharArray1=text1.toCharArray();
			char [] CharArray2=text2.toCharArray();
			Arrays.sort(CharArray1);
			Arrays.sort(CharArray2);
			boolean result=Arrays.equals(CharArray1, CharArray2);
			if(result) {
				System.out.println(text1 + "and" + text2 + "is an Anagram");
			}
			else
			{
				System.out.println(text1 + "and" + text2 + "is not an Anagram");

			}

			
		}
		
		
	
		
		
		
		
	}

}
