import java.util.ArrayList;

public abstract class Product{
   private String productId;
   private String name;
   private double price;

   public Product(String productId, String name, double price){
	this.productId = productId;
	this.name = name;
	this.price = price;
   }
 
   public abstract double calculateDiscount();

   public void displayDetails(){
	System.out.println("ProductID: " + productId + " ,Name: " + name + ", Price: $ " +price);
   }

   public double getPrice(){
	return price;
   }

   public void stePrice(double price){
	if(price>0){
	   this.price = price;
	}
   }
}

interface Taxable{
   double calculateTax();
   String getTaxDetails();
}

class Electronics extends Product implements Taxable{
   private double warrantyYears;

   public Electronics(String productId, String name, double price, double warrantyYears){
	super(productId, name, price);
	this.warrantyYears = warrantyYears;
   }

   @Override
   public double CalculateDiscount(){
	return getPrice()*0.10;
   }

   @Override
   public double calculateTax(){
	return getPrice()*0.18;
   }

   @Override
   public String getTaxDetails(){
	return "Electronics Tax: 18% GST";
   }
}

class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(int productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15;  // 15% discount on clothing
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12;  // 12% GST
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 12% GST";
    }
}

// Groceries class (non-taxable)
class Groceries extends Product {
    private String expiryDate;

    public Groceries(int productId, String name, double price, String expiryDate) {
        super(productId, name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;  // 5% discount on groceries
    }
}

class Main{

public static void calculateFinalPrice(ArrayList<Product> products){
	System.out.println("\n--- Final Price Calculation ---");
        for (Product product : products) {
            product.displayDetails();

            double discount = product.calculateDiscount();
            double tax = 0;

            // Check if product is taxable
            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
                System.out.println(((Taxable) product).getTaxDetails());
            }

            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Discount: $" + discount);
            System.out.println("Tax: $" + tax);
            System.out.println("Final Price: $" + finalPrice + "\n");
        }
    }


   public static void main(String[] args){
	ArrayList<Product>products = new ArrayList<>();
	products.add(new Electronics("E01", "Laptop", 50000, 2));
	products.add(new Clothing(102, "T-Shirt", 1500, "L"));
        products.add(new Groceries(103, "Rice", 800, "2025-06-15"));

	caclculateFinalPrice(products);
   }

}


