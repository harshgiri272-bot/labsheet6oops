public class MedicineProductMain {    
  public static void main(String[] args) {       
    MedicineProduct product = new MedicineProduct("Syrup", "S101", 120); 
    product.setPrice(135);        
    System.out.println("Price through getter: " + product.getPrice());       
    product.displayProduct();   
  } 
} 
class MedicineProduct {  
  private String medicineName, batchNo;  
  private double price;  
  MedicineProduct(String medicineName, String batchNo, double price){  
    this.medicineName = medicineName;  
    this.batchNo = batchNo; 
    this.price = price;  
  }   
  public String getMedicineName() { 
    return medicineName;
  }  
  public String getBatchNo() { 
    return batchNo; 
  }  
  public double getPrice() { 
    return price;
  }   
  public void setMedicineName(String medicineName) {
    this.medicineName = medicineName; 
  }  
  public void setBatchNo(String batchNo) { 
    this.batchNo = batchNo; 
  }
  public void setPrice(double price) {
    this.price = price;
  }  
  public void displayProduct() {   
    System.out.println(medicineName + " | " + batchNo + " | " + price);
  } 
}
