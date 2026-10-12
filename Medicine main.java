public class MedicineMain {
    public static void main(String[] args) {
        Medicine m1 = new Medicine("Paracetamol", "B101", 25.5);
        Medicine m2 = new Medicine("Amoxicillin", "B202", 75.0);
        m1.displayMedicine();
        m2.displayMedicine();
    }
}
class Medicine {
    String medicineName, batchNo;
    double price;
    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }
    void displayMedicine() {
        System.out.println(medicineName + " | Batch: " + batchNo + " | Price: " + price);
    }
}
