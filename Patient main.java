public class PatientMain {
    public static void main(String[] args) {
        Patient[] patients = {
            new Patient(1, "Asha", 22),
            new Patient(2, "Ravi", 30),
            new Patient(3, "Neha", 25),
            new Patient(4, "Karan", 40),
            new Patient(5, "Pooja", 28)
        };
        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}
class Patient {
    int patientId;
    String patientName;
    int age;
    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }
    void displayPatient() {
        System.out.println(patientId + " | " + patientName + " | Age: " + age);
    }
}
class PatientManager {
    void displayAllPatients(Patient[] patients) {
        for (int i = 0; i < patients.length; i++) patients[i].displayPatient();
    }
}
