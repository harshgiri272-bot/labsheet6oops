public class SingleInheritanceMain {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist(101, "Amit", 45000, "LIC100");
        pharmacist.displayPharmacist();
    }
}
class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double salary;
    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }
    void displayEmployee() {
        System.out.println(employeeId + " | " + employeeName + " | " + salary);
    }
}
class Pharmacist extends Employee {
    private String licenseNo;
    Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }
    void displayPharmacist() {
        displayEmployee();
        System.out.println("License: " + licenseNo);
    }
}
