package week1.day3;

public class PrimeNumber {
	public static void main(String[] args) {
		int fact=18;
		int count=0;
		for(int i=2;i<=fact/2;i++) {
			if(fact%i==0) {
				count++;
				break;
				
			}
			
			
		}
		if(count==0) {
			System.out.println(fact+"is an prime number");
			
		}
		else {
			System.out.println(fact+"is not a prime number");
		}
	}

}
