public class PatientTest {
	public static void main(String[] args) {
		Patient<String> man = new Patient<>("Tom","45","Scurvy");
		man.addPatient(new Patient<String>("Ben","86","Dementia"));
		man.addPatient(new Patient<String>("Lucy","19","Sick"));
		man.printList();
	}
}