public class Product{
   private static double discount = 10.0;
   private String productName;
   private int price;
   private String quantity;
   private final String productID;


   public Product(String productName, int price, String quantity, String productID){
	this.productName = productName;
	this.price = price;
	this.quantity = quantity;
	this.productID = productID;
   }


   public static void updateDiscount(double dis){
	discount = dis;
	System.out.println("The Updated Discount is: " + discount);
   }


   public void Display(){
	System.out.println("The Product is: " + productName);
	System.out.println("The Price is: " + price);
	System.out.println("The Quantity of the Product is: " + quantity);
	System.out.println("The Product Id is: " + productID);
	System.out.println("The Discount on This Product is: " + discount);
   }


   public static void main(String[] args){
	Product product1 = new Product("Rice", 20, "1 KG", "RC1");
	Product product2 = new Product("Beans", 10, "2 Kg", "B1");

	product1.Display();
	product2.Display();

	Product.updateDiscount(20.0);

	product1.Display();

   }
}
