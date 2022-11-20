public class Medicine {
    private String name;
    private int inStorage;
    private boolean reqPrescription;
    private double dosesPerDay;
    private double singleDose;

    public Medicine(String name, int inStorage, boolean reqPrescription, double dosesPerDay, double singleDose) {
        this.name = name;
        this.inStorage = inStorage;
        this.reqPrescription = reqPrescription;
        this.dosesPerDay = dosesPerDay;
        this.singleDose = singleDose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInStorage() {
        return inStorage;
    }

    public void setInStorage(int inStorage) {
        this.inStorage = inStorage;
    }

    public boolean isReqPrescription() {
        return reqPrescription;
    }

    public void setReqPrescription(boolean reqPrescription) {
        this.reqPrescription = reqPrescription;
    }

    public double getDosesPerDay() {
        return dosesPerDay;
    }

    public void setDosesPerDay(double dosesPerDay) {
        this.dosesPerDay = dosesPerDay;
    }

    public double getSingleDose() {
        return singleDose;
    }

    public void setSingleDose(double singleDose) {
        this.singleDose = singleDose;
    }
}
