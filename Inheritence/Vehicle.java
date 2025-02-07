public class Vehicle{
   private float maxSpeed;
   private String fuelType;

   public Vehicle(float maxSpeed, String fuelType){
	this.maxSpeed = maxSpeed;
	this.fuelType = fuelType;
   }

   public void Display(){
	System.out.println("The Max Speed Of The Vehicle is: " + maxSpeed);
	System.out.println("The Type of Fuel this Vehicle has is: " + fuelType);
   }
}

class Car extends Vehicle{
   private int seat;

   public Car(float maxSpeed, String fuelType, int seat){
	super(maxSpeed, fuelType);
	this.seat = seat;
   }

  @Override
   public void Display(){
	super.Display();
	System.out.println("The Number of Seats Car has is: " + seat);
   }

}

class Truck extends Vehicle{
   private String size;

   public Truck(float maxSpeed, String fuelType, String size){
	super(maxSpeed, fuelType);
	this.size = size;
   }

  @Override
   public void Display(){
	super.Display();
	System.out.println("The Size of the Truck is: " + size);
   }
}

class Motorcycle extends Vehicle{
   private String type;

   public Motorcycle(float maxSpeed, String fuelType, String type){
	super(maxSpeed, fuelType);
	this.type = type;
   }
   @Override
   public void Display(){
	super.Display();
	System.out.println("The Motorcycle is; " + type);
   }
}

class Main{
   public static void main(String[] args){
	Vehicle [] vehicle = new Vehicle[3];
	vehicle[0] = new Car(200, "Petrol", 4);
	vehicle[1] = new Truck(150, "Diesel", "Cargo Truck");
	vehicle[2] = new Motorcycle(100, "Petrol", "Mountain Bike");

	for(Vehicle v : vehicle){
	   v.Display();
	   System.out.println();
	}
   }
}
