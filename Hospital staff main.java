public class HospitalStaffMain {
    public static void main(String[] args) {
        Employee[] staff = {
            new Doctor("Neha", 40, 101, 80000, "Cardiology"),
            new Pharmacist("Raj", 32, 102, 50000, "LIC900")
        };
        StaffManager manager = new StaffManager();
        manager.displayStaff(staff);
    }
}
class Person {
    protected String name;
    protected int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person {
    private int employeeId;
    private double salary;
    static int employeeCount;
    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
        employeeCount++;
    }
    public int getEmployeeId() { return employeeId; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { if (salary >= 0) this.salary = salary; }
}
class Doctor extends Employee {
    private String specialization;
    Doctor(String name, int age, int employeeId, double salary, String specialization) {
        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }
    void display() {
        System.out.println("Doctor: " + name + " | " + getEmployeeId() + " | " + specialization);
    }
}
class Pharmacist extends Employee {
    private String licenseNo;
    Pharmacist(String name, int age, int employeeId, double salary, String licenseNo) {
        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }
    void display() {
        System.out.println("Pharmacist: " + name + " | " + getEmployeeId() + " | " + licenseNo);
    }
}
class StaffManager {
    void displayStaff(Employee[] staff) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] instanceof Doctor)
                ((Doctor) staff[i]).display();
            else if (staff[i] instanceof Pharmacist)
                ((Pharmacist) staff[i]).display();
        }
        System.out.println("Total Employees: " + Employee.employeeCount);
    }
}
