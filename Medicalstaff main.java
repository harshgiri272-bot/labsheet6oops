public class MedicalStaffMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(101, "Neha", "Cardiology");
        Pharmacist pharmacist = new Pharmacist(102, "Raj", "LIC900");
        doctor.displayDoctor();
        pharmacist.displayPharmacist();
    }
}
class MedicalStaff {
    protected int staffId;
    protected String staffName;
    MedicalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }
}
class Doctor extends MedicalStaff {
    private String specialization;
    Doctor(int staffId, String staffName, String specialization) {
        super(staffId, staffName);
        this.specialization = specialization;
    }
    void displayDoctor() {
        System.out.println(staffId + " | " + staffName + " | Doctor | " + specialization);
    }
}
class Pharmacist extends MedicalStaff {
    private String licenseNo;
    Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }
    void displayPharmacist() {
        System.out.println(staffId + " | " + staffName + " | Pharmacist | " + licenseNo);
    }
}
