package week1.day3;

public class FibonacciSeries {
	public static void main(String[] args) {
		int firstNo=0;
		System.out.println(firstNo);
		int secNo=1;
		System.out.println(secNo);
		int sum=0;
	for (int a=1;a<=8;a++) {
		sum=firstNo+secNo;
		System.out.println(sum);
		firstNo=secNo;
		secNo=sum;

		}
			
		
	}

}
	
