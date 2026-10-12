public class PublicAccessMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.hospitalName = "City Hospital";
        hospital.hospitalCode = "H101";
        System.out.println(hospital.hospitalName);
        System.out.println(hospital.hospitalCode);
        hospital.displayHospital();
    }
}
class Hospital {
    // public members can be accessed directly from another class.
    public String hospitalName;
    public String hospitalCode;
    public Hospital() {
        hospitalName = "General Hospital";
        hospitalCode = "H000";
    }
    public void displayHospital() {
        System.out.println("Hospital: " + hospitalName + " | Code: " + hospitalCode);
    }
}
