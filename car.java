package week1;

public class Car {

	public void applyBreak() {
		System.out.println("apply break");
	}
	
	public void doorLock() {
		System.out.println("door lock");
	}
	
	public void fanOn() {
		System.out.println("fan on");
	}
	
	public void applyAccelerate() {
		System.out.println("apply accelerate");
	}
	public static void main(String[] args) {
		
        Car pmw = new Car();
        pmw.applyBreak();
        pmw.doorLock();
        pmw.fanOn();
        pmw.applyAccelerate();
	}

}