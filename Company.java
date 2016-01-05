public class Company {
	public static void main(String[] args) {
		Patient<String> name = new Patient<>("Tom");
		name.addPatient(new Patient<String>("Ben"));
		name.addPatient(new Patient<String>("Lucy"));
		
		Patient<Integer> niNumber = new Patient<>(1234);
		niNumber.addPatient(new Patient<Integer>(5678));
		niNumber.addPatient(new Patient<Integer>(9123));
	}
}