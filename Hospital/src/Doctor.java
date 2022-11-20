public class Doctor {
    private String firstName;
    private String lastName;
    private int age;
    private String specialization;
    private int yearsOfExperience;

    public String getFirstName() {
        return firstName;
    }

    public Doctor(String firstName, String lastName, int age, String specialization, int yearsOfExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
