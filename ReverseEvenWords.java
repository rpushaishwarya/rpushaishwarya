package week2.day1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String text="I am a software tester";
		String [] temp1=text.split("");
		for(int i=0;i<=temp1.length-1;i++) {
			if(i%2!=0) {
				char [] charArray=temp1[i].toCharArray();
				for (int j=charArray.length-1;j>0;j--) {
					System.out.println(charArray[j]);
				}
				
				
			}
			else {
				System.out.println(temp1[i]);
			}

		
	}
		
	}
	
	

}
