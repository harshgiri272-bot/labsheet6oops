public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.medicineName = "Paracetamol"; // default/package-private
        pharmacy.price = 25.5;                 // default/package-private
        pharmacy.displayMedicine();
    }
}
class Pharmacy {
    // No keyword means default/package-private access.
    String medicineName;
    double price;
    Pharmacy() {
        medicineName = "Medicine";
        price = 10;
    }
    void displayMedicine() {
        System.out.println(medicineName + " | Price: " + price);
    }
}
