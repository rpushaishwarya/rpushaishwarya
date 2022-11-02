package week4.day3;

public class Auto extends Bajaj {
	public void startHandleStaeter() {
		System.out.println("start");
	}
	public static void main(String[] args) {
		Auto ao =new Auto();
		ao.soundHorn();
		ao.startHandleStaeter();
		
		
	}

}
