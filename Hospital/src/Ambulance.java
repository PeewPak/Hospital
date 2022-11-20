public class Ambulance {
    private String registrationNumber;
    private String type;
    private int numberOfStaff;
    private int capacity;
    private int maxSpeed;

    public Ambulance(String registrationNumber, String type) {
        this.registrationNumber = registrationNumber;
        this.type = type;
        this.numberOfStaff = 3;
        this.capacity = 1;
        this. maxSpeed = 150;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfStaff() {
        return numberOfStaff;
    }

    public void setNumberOfStaff(int numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
