import java.util.Scanner;
public class InputDiscount{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the User Fee");
      float fee = sc.nextFloat();
      System.out.println("Enter the Discount Percent");
      float percent = sc.nextFloat();
      float discountFee = (fee * percent)/100;
      float discountAmount = fee - discountFee;
      System.out.println("The discount amount is INR" + " " + discountAmount);
      System.out.println("The Discounted fee is INR" + " " + discountFee);

  }
}

