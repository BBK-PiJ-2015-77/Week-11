public class MobilePhone extends OldPhone {
	
	public MobilePhone(String brand) {
		super(brand);
	}
	
	private final static int MAX = 10;
	private String[] callArray = new String[MAX];
	private int index = 0;
	
	@Override
	public void call(String number) {
		super.call(number);
		if (index < MAX) {
			callArray[index] = number;
			index++;
		} else {
			for (int i = 0; i < (MAX - 1); i++) {
				callArray[i] = callArray[i+1];
			}
			callArray[9] = number;
		}
	}
	
	public void ringAlarm(String alarm) {
		System.out.println(alarm + " is ringing.");
	}
	
	public void playGame(String game) {
		System.out.println("You are playing " + game);
	}
	
	public void printLastNumbers() {
		System.out.println("The last 10 numbers called were:");
		for (int i = 0; i < MAX; i++) {
			System.out.println(callArray[i]);
		}
	}
	
}