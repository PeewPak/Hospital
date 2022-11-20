import java.util.ArrayList;
import java.util.List;

public class Operation {
    private Patient patient;
    private Doctor[] doctors;
    private String date;
    private Room room;
    private String disease;

    public Operation(Patient patient, Doctor[] doctors, String date, Room room, String disease) {
        this.patient = patient;
        this.doctors = doctors;
        this.date = date;
        this.room = room;
        this.disease = disease;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List getNameOfDoctors() {
        if(this.doctors == null){return null;}
        List<String> names = new ArrayList<>();
        for(int i = 0; i < this.doctors.length; i++){
            names.add(doctors[i].getFirstName());
        }
        return names;
    }

    public void addDoctor(Doctor doctor) {
        int oldSize = 0;
        if(this.doctors != null){oldSize = this.doctors.length;}

        Doctor[] newDoctors  = new Doctor[oldSize + 1];
        for(int i = 0; i < oldSize; i++){
            newDoctors[i] = this.doctors[i];
        }
        newDoctors[oldSize] = doctor;
        this.doctors = newDoctors;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
