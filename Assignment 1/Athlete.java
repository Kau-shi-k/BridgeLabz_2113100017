import java.util.Scanner;
public class Athlete{
   public static double round(double a, double b, double c, double distance){
     double perimeter = a + b + c;
     return distance/perimeter;
   }
   public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Sides");
      double s1 = sc.nextDouble();
      double s2 = sc.nextDouble();
      double s3 = sc.nextDouble();
      double d = 5.0;
      double rounds = round(s1, s2, s3, d);
      System.out.println("Rounds to be completed are" + rounds);


   }
}
