import java.util.Scanner;
public class KmToMiles{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Distance in KM");
      double km = sc.nextDouble();
      double miles = km/1.6;
      System.out.println("The Distance in Miles is" + miles);
    }
}

