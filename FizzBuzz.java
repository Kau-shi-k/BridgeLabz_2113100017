import java.util.Scanner;
public class FizzBuzz{
   public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number:");
      int num = sc.nextInt();
      for(int i = 0; i<=num; i++){
         if(i%3==0 && i%5==0){
           System.out.println("FrizzBuzz");
         } else if(i%5==0) {
           System.out.println("Buzz");
         } else if(i%3==0){
           System.out.println("Frizz");
         } else {
           System.out.println(i);
         }
      }
    }
}
          
