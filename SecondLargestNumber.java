package week1.day4;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		System.out.println(data[data.length-2]);
	}

}
