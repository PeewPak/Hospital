public class Prescription {
    private int ID;
    private String date;
    private Patient patient;
    private Doctor doctor;
    private Medicine[] medicines;
    private String note;

    public Prescription(int ID, String date, Patient patient, Doctor doctor, Medicine[] medicines, String note) {
        this.ID = ID;
        this.date = date;
        this.patient = patient;
        this.doctor = doctor;
        this.medicines = medicines;
        this.note = note;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Medicine[] getMedicines() {
        return medicines;
    }

    public void setMedicines(Medicine[] medicines) {
        this.medicines = medicines;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
