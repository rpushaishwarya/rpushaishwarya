package week2.day1;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String text="changeme";
		char [] CharArray=text.toCharArray();
		int length=CharArray.length;
		for(int i=0;i<=length-1;i++) {
		if(i%2!=0) {
			char upperCase=Character.toUpperCase(CharArray[i]);
			System.out.println(upperCase);
		}
		else {
			System.out.println(CharArray[i]);
		}
				
				
			}
		}
		
	}


