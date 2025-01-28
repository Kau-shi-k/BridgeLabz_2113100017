import java.util.Scanner;
public class SL{
  public static void Small(int a, int b, int c){
    int smallest = Math.min(a, Math.min(b, c));
    int largest = Math.max(a, Math.max(b, c));
    System.out.println("The Smallest and Largest Number is" + smallest +largest);
  }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Three Numbers");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    Small(num1, num2, num3);
  }
}
