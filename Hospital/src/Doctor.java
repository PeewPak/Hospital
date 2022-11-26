public class Doctor extends Person{
    private String specialization;
    private int yearsOfExperience;

    public Doctor(String firstName, String lastName, int age, String specialization, int yearsOfExperience) {
        super(firstName, lastName, age);
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Prescription writePrescription(int ID, String date, Patient patient, Doctor doctor, Medicine[] medicines, String note){
        Prescription newPrescription = new Prescription(ID, date, patient, doctor, medicines, note);
        return newPrescription;
    }
}
