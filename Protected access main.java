public class ProtectedAccessMain {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist(101, "Neha", "LIC500");
        pharmacist.showProtectedData();
    }
}
class HospitalStaff {
    protected int staffId;
    protected String staffName;
    protected HospitalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }
    protected void displayStaff() {
        System.out.println(staffId + " | " + staffName);
    }
}
class Pharmacist extends HospitalStaff {
    private String licenseNo;
    Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }
    void showProtectedData() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + staffName);
        System.out.println("License: " + licenseNo);
        displayStaff();
    }
}
