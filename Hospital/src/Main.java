public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient("Pat", "Nar", 20, "Ul. Wolna");
        Patient p2 = new Patient("Mat", "Kat", 36, "Ul. Szybka");
        Room sala1 = new Room(1);
        sala1.addPatients(p1);
        System.out.println(sala1.getAllPatients());
        System.out.println(sala1.getPatient(0).getFirstName());

    }
}