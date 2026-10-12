public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
            new Pharmacist(101, "Amit", 45000, "LIC100"),
            new StoreManager(102, "Neha", 55000, 3)
        };
        PharmacyEmployeeManager manager = new PharmacyEmployeeManager();
        manager.processEmployees(employees);
    }
}
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;
    static int employeeCount;
    protected String department = "Pharmacy"; // protected member for child classes.
    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        employeeCount++;
    }
    public int getEmployeeId() { return employeeId; }
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }
    public void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;
    }
    void packageMessage() { System.out.println("Default/package-private method."); }
    void display() {
        System.out.println(employeeId + " | " + employeeName + " | Salary: " + salary);
    }
}
class Pharmacist extends Employee {
    private String licenseNo;
    Pharmacist(int employeeId, String employeeName, double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }
    void displayRole() {
        System.out.println("Pharmacist | License: " + licenseNo + " | Department: " + department);
    }
}
class StoreManager extends Employee {
    private int storeSection;
    StoreManager(int employeeId, String employeeName, double salary, int storeSection) {
        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
    }
    void displayRole() {
        System.out.println("Store Manager | Section: " + storeSection + " | Department: " + department);
    }
}
class PharmacyEmployeeManager {
    void processEmployees(Employee[] employees) {
        double totalSalary = 0; // local variable
        int pharmacistCount = 0;
        for (int i = 0; i < employees.length; i++) {
            employees[i].display();
            totalSalary += employees[i].getSalary();
            if (employees[i] instanceof Pharmacist) {
                ((Pharmacist) employees[i]).displayRole();
                pharmacistCount++;
            } else if (employees[i] instanceof StoreManager) {
                ((StoreManager) employees[i]).displayRole();
            }
        }
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Pharmacists: " + pharmacistCount);
        System.out.println("Employee Count: " + Employee.employeeCount);
    }
}
