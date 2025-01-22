public class Volume{
   public static void main(String[] args){
     double radius = 6378;
     double volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);
     double volumeMiles = volume/Math.pow(1.6,3);
     System.out.println("The Volume of Earth In Cubic Kilometers" + " " + volume);
     System.out.println("The Volume of Earth In Cubic Miles" + " " + volumeMiles);
   }
}
