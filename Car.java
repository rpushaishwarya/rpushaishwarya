package week4.day3;

public class Car extends Vehicale{
	public void switchOnAc() {
		System.out.println("car is cooling");	
	}
	public static void main(String[] args) {
		Car cr=new Car();
		cr.applyBrake();
		cr.switchOnAc();
		
	}

}
