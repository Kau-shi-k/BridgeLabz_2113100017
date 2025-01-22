import java.util.Scanner;
public class QR{
   public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two Numbers");
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int Q = num1/num2;
      int R = num1%num2;
      System.out.println("The Quotient is" + " " + Q + "And Reminder is" + " " + R);
   }
}
