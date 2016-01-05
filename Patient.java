public class Patient<T> {

    private T value;
    private Patient nextPatient;
    private Patient previousPatient;

    public Patient(T value) {
        this.value = value;
        this.nextPatient = null;
        this.previousPatient = null;
    }

    public T getValue() {
        return value;
    }

    public Patient getNextPatient() {
        return nextPatient;
    }

    public Patient getPreviousPatient() {
        return previousPatient;
    }


    public void setPreviousPatient(Patient previousPatient) {
        this.previousPatient = previousPatient;
    }

    //add a patient to list

    public void addPatient(Patient newPatient) {
        if (this.nextPatient == null) {
            this.nextPatient = newPatient;
            newPatient.previousPatient = this;
        } else {
            this.nextPatient.addPatient(newPatient);
        }
    }

    //delete a patient from list

    public boolean deletePatient(Patient patient) {

        if (this.nextPatient == null) {
            //patient to be removed was not found
            return false;
        } else if (this.nextPatient.value.equals(patient.value)) {
            //we found it...it is the next one...
            //now link this patient to the one after the next
            this.nextPatient = nextPatient.nextPatient;
            nextPatient.previousPatient = this;
            return true;
        } else {
            return this.nextPatient.deletePatient(patient);
        }

    }
	
	public void printList() {
		if (this.nextPatient != null) {
			
			this.getNextPatient().printList();
		}
		System.out.println(this.getValue());
	}
	
}