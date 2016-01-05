public class SmartPhone extends MobilePhone {
	
	public SmartPhone(String brand) {
		super(brand);
	}
	
	public void browseWeb(String web) {
		System.out.println("Opening browser and navigating to " + web);
	}
	
	public void findPosition() {
		System.out.println("Your current GPS co-ordinates are 51.531003, -0.596998");
	}
	
}