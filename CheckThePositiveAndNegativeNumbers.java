package week1.day3;

public class CheckThePositiveAndNegativeNumbers {
	public void getNumber(int i) {
		if(i>=0) {
			System.out.println(i+"is positive number");
		}
		else {
			System.out.println(i+"is negative number");
		}
	}
public static void main(String[] args) {
	CheckThePositiveAndNegativeNumbers number=new CheckThePositiveAndNegativeNumbers();
	number.getNumber(-100);
	
	
	
}


}
