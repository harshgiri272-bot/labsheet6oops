public class HierarchicalMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Neha", 40, "Cardiology");
        Nurse nurse = new Nurse("Pooja", 28, "Ward A");
        doctor.displayDoctor();
        nurse.displayNurse();
    }
}
class Person {
    protected String name;
    protected int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayPerson() {
        System.out.println(name + " | Age: " + age);
    }
}
class Doctor extends Person {
    private String specialization;
    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }
    void displayDoctor() {
        displayPerson();
        System.out.println("Doctor | Specialization: " + specialization);
    }
}
class Nurse extends Person {
    private String ward;
    Nurse(String name, int age, String ward) {
        super(name, age);
        this.ward = ward;
    }
    void displayNurse() {
        displayPerson();
        System.out.println("Nurse | Ward: " + ward);
    }
}
