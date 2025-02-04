public class Patient {
    static String hospitalName = "City Medical Center";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("This is not a valid Patient object.");
        }
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("John Doe", 45, "Diabetes", 101);
        Patient patient2 = new Patient("Jane Smith", 32, "Asthma", 102);

        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        getTotalPatients();
    }
}
