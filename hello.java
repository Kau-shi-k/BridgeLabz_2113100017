import java.util.Scanner;
public class miles{
    public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Distance in Kilometers");
	   double kilo = sc.nextDouble();
	   double miles;
	   miles = kilo * 0.621371;
	   System.out.println("Kilometers to Miles is" + miles);
	}
}
