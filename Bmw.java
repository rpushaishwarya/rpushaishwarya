package week4.day3;

public class Bmw extends Audi{
	public void applyGear() {
		System.out.println("grearspeed");
	}
	public static void main(String[] args) {
		Bmw bm =new Bmw();
		bm.applyGear();
		bm.switchOnAc();
		bm.openSunRoof();
		bm.applyBrake();
	}

}
