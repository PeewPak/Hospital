import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String address;
    private int capacity;
    private int bedsAvailable;
    private String name;
    private Doctor[] doctors;
    private Patient[] patients;
    private Ambulance[] ambulances;
    private Medicine[] medicines;
    private Room[] rooms;

    public Hospital(String address, int capacity, int bedsAvailable, String name) {
        this.address = address;
        this.capacity = capacity;
        this.bedsAvailable = bedsAvailable - patients.length;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBedsAvailable() {
        return bedsAvailable;
    }

    public void setBedsAvailable(int bedsAvailable) {
        this.bedsAvailable = bedsAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getDoctors() {
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

    public List getAllPatients() {
        if(this.patients == null){return null;}
        List <String> names = new ArrayList<>();
        for(int i = 0; i < this.patients.length; i++){
            names.add(patients[i].getFirstName());
        }
        return names;
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

    public List getAllAmbulances() {
        if(this.ambulances == null){return null;}
        List <String> numbers = new ArrayList<>();
        for(int i = 0; i < this.ambulances.length; i++){
            numbers.add(ambulances[i].getRegistrationNumber());
        }
        return numbers;
    }

    public void addAmbulance(Ambulance ambulance) {
        int oldSize = 0;
        if(this.ambulances != null){oldSize = this.ambulances.length;}
        Ambulance[] newAmbulances = new Ambulance[oldSize + 1];
        for(int i = 0; i < oldSize; i++){
            newAmbulances[i] = this.ambulances[i];
        }
        newAmbulances[oldSize] = ambulance;
        this.ambulances = newAmbulances;
    }

    public List getMedicines() {
        if(this.rooms == null){return null;}
        List <String> Medicines = new ArrayList<>();
        for(int i = 0; i < this.medicines.length; i++){
            Medicines.add(medicines[i].getName());
        }
        return Medicines;
    }

    public void addMedicine(Medicine medicine) {
        int oldSize = 0;
        if(this.medicines != null){oldSize = this.medicines.length;}
        Medicine[] newMedicines = new Medicine[oldSize + 1];
        for(int i = 0; i < oldSize; i++){
            newMedicines[i] = this.medicines[i];
        }
        newMedicines[oldSize] = medicine;
        this.medicines = newMedicines;
    }

    public List getRooms() {
        if(this.rooms == null){return null;}
        List <Integer> roomNumber = new ArrayList<>();
        for(int i = 0; i < this.rooms.length; i++){
            roomNumber.add(rooms[i].getRoomNumber());
        }
        return roomNumber;
    }

    public void addRoom(Room room) {
        int oldSize = 0;
        if(this.rooms != null){oldSize = this.rooms.length;}
        Room[] newRoom = new Room[oldSize + 1];
        for(int i = 0; i < oldSize; i++){
            newRoom[i] = this.rooms[i];
        }
        newRoom[oldSize] = room;
        this.rooms = newRoom;
    }
}
