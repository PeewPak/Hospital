import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Room {
    private int roomNumber;
    private int bedsInTotal;
    private int bedsAvailable;
    private Patient[] patients;
    private String specialization = "None";

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.bedsInTotal = 4;
        this.bedsAvailable = bedsInTotal;
    }

    public List getAllPatients() {
        if(this.patients == null){return null;}
        List <String> names = new ArrayList<>();
        for(int i = 0; i < this.patients.length; i++){
            names.add(patients[i].getFirstName());
        }
        return names;
    }

    public Patient getPatient(int bed){
        return patients[bed];
    }

    public void addPatients(Patient patient) {
        int oldSize = 0;
        if(this.patients != null){oldSize = this.patients.length;}

        Patient[] newPatients  = new Patient[oldSize + 1];
        for(int i = 0; i < oldSize; i++){
            newPatients[i] = this.patients[i];
        }
        newPatients[oldSize] = patient;
        this.patients = newPatients;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBedsInTotal() {
        return bedsInTotal;
    }

    public void setBedsInTotal(int bedsInTotal) {
        this.bedsInTotal = bedsInTotal;
    }

    public int getBedsAvailable() {
        return bedsAvailable;
    }

    public void setBedsAvailable(int bedsAvailable) {
        this.bedsAvailable = bedsAvailable;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room room)) return false;
        return getRoomNumber() == room.getRoomNumber() && Arrays.equals(patients, room.patients) && getSpecialization().equals(room.getSpecialization());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getRoomNumber(), getSpecialization());
        result = 31 * result + Arrays.hashCode(patients);
        return result;
    }
}
