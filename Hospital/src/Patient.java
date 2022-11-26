public class Patient extends Person{
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private boolean inHospital;
    private int roomNumber;
    private int bedNumber;

    public Patient(String firstName, String lastName, int age, String address) {
        super(firstName, lastName, age);
        this.address = address;
        this.inHospital = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isInHospital() {
        return inHospital;
    }

    public void setInHospital(boolean inHospital) {
        this.inHospital = inHospital;
    }

    public Appointment makeAppointment(String date, String time, Doctor doctor, Patient patient){
        Appointment newAppointment = new Appointment(date, time, doctor, patient);
        return newAppointment;
    }
}
