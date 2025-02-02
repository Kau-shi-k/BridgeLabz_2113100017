public class Hotel{
   private String guestName;
   private String roomType;
   private int nights;

   public Hotel(){
     this.guestName = "Unknown";
     this.roomType = "Unknown";
     this.nights = 1;
   }

   public Hotel(String guestName, String roomType, int nights){
     this.guestName = guestName;
     this.roomType = roomType;
     this.nights = nights;
   }

   public Hotel(Hotel other){
     this.guestName = other.guestName;
     this.roomType = other.roomType;
     this.nights = other.nights;
   }

   public void Display(){
     System.out.println("The Guest Name is" + " " + guestName);
     System.out.println("The Room Type is" + " " + roomType);
     System.out.println("The Nights are" + " " + nights);
   }

   public static void main(String[] args){
      Hotel hotel1 = new Hotel();
      Hotel hotel2 = new Hotel("Ojas", "King", 5);
      Hotel hotel3 = new Hotel(hotel2);
      hotel1.Display();
      hotel2.Display();
      hotel3.Display();
   }
}
