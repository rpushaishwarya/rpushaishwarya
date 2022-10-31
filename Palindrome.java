package week2.day1;

public class Palindrome {
	public static void main(String[] args) {
		String name="madam";
		String rev="";
		char[] CharArray=name.toCharArray();
		int length=CharArray.length-1;
		for(int i=length;i>=0;i--) {
			rev=rev+CharArray[i];
		}
			if(name.equals(rev)) {
				System.out.println(name+"is an palindrome");
				}
			else {
				System.out.println(name+"is not an palindrome");
				}
			}
		
				}


