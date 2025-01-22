import java.util.Scanner;
public class Calculator{
   public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two Numbers, First Number should be larger");
       float num1 = sc.nextFloat();
       float num2 = sc.nextFloat();
       if(num1>num2) {

          float add = num1 + num2;
          float sub = num1 - num2;
          float mul = num1*num2;
          float div = num1/num2;
          System.out.println("Addition, Subtraction, Multiplication And Division");
          System.out.println(add + " " + sub + " " + mul + " " + div);

       }
       else{
          System.out.println("First Number is less than Second number");
       }
    }
}
