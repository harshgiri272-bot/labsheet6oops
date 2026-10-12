public class PatientValidationMain {
    public static void main(String[] args) {
        Patient patient = new Patient("Riya", 25, 55.5);
        patient.setAge(26);
        patient.setAge(-2);       // Invalid value is rejected.
        patient.setWeight(57.0);
        patient.setWeight(0);     // Invalid value is rejected.
        patient.displayPatient();
    }
}
class Patient {
    private String patientName;
    private int age;
    private double weight;
    Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        this.age = age;
        this.weight = weight;
    }
    public String getPatientName() { return patientName; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }
    public void setPatientName(String patientName) { this.patientName = patientName; }
    public void setAge(int age) { if (age >= 0) this.age = age; }
    public void setWeight(double weight) { if (weight > 0) this.weight = weight; }
    public void displayPatient() {
        System.out.println(patientName + " | Age: " + age + " | Weight: " + weight);
    }
}
