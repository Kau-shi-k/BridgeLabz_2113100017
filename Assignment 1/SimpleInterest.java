import java.util.Scanner;
public class SimpleInterest{
   public static int Interest(int P,int R,int T){
      
      int simpleInterest = (P*R*T)/100;
      return simpleInterest;
   }
   public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Principal");
       int P = sc.nextInt();
       System.out.println("Enter Rate");
       int R = sc.nextInt();
       System.out.println("Enter Time");
       int T = sc.nextInt();
       
       System.out.println("The Simple Interest is " + Interest(P, R, T));
   }
}


