package week1;

public class Mobile {
	public void switchOnMobile() {
		System.out.println("switchOnMobile");
	}
	private void shareNumber() {
		System.out.println("shareNumber");
	}
	protected void makeCall() {
		System.out.println("makeCall");	
	}
	void switchOffMobile() {
	     System.out.println("switchOffMobile");
	}
	
	public static void main(String[] args) {
		Mobile Mobile=new Mobile();
	    Mobile.switchOnMobile();
	    Mobile.shareNumber();
	    Mobile.makeCall();
	    Mobile.switchOffMobile();
	    
	} 
}
