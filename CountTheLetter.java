package week2.day1;

public class CountTheLetter {
	public static void main(String[] args) {
		String str="welcome to chennai";
		int count=0;
		char []	charArray=str.toCharArray();
		int length=charArray.length;
		for(int i=0;i<length;i++) {
			if(charArray[i]=='e') {
				count++;
				}
			}
		System.out.println(count);
 
		
				}

}
