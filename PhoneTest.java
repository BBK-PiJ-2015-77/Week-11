public class PhoneTest {
	
	public void testPhone(Phone phone) {
		SmartPhone sm = (SmartPhone) phone;
		sm.call("123");	
		sm.findPosition();
	}
	

	public static void main(String[] args) {
		
		MobilePhone myPhone = new SmartPhone("Nokia");
		/*
		((SmartPhone)myPhone).browseWeb("youtube.com");
		((SmartPhone)myPhone).findPosition();
		*/
		PhoneTest pt = new PhoneTest();
		pt.testPhone(myPhone);
	}
}