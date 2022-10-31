package week1.day4;

import java.util.Arrays;

public class ArrayDecendingOder {
	public static void main(String[]args) {
		int[] a= {10,50,40,20,30};
		Arrays.sort(a);//control+space
		//with out loop
		//system.out.ptintln(Arrays.tostring(a));output [10,20,30,40,50]
		//							(typecasting)	//				
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
			
		}
		
		
	}

		

}
