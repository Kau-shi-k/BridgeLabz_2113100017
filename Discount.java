public class Discount{
   public static void main(String[] args){
      float fee = 125000;
      float percent = 10;
      float discountFee = (fee * percent)/100;
      float discountAmount = fee - discountFee;
      System.out.println("The discount amount is INR" + " " + discountAmount);
      System.out.println("The Discounted fee is INR" + " " + discountFee);

  }
}
