import java.util.Scanner;
public class Young{
   public static void main(String [] main){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enters Amar Age");
     int age1 = sc.nextInt();
     int h1 = sc.nextInt();
     System.out.println("Enter Akbar Age");
     int age2 = sc.nextInt();
     int h2 = sc.nextInt();
     System.out.println("Enter Anthony Age");
     int age3 = sc.nextInt();
     int h3 = sc.nextInt();
 
     int youngest = Math.min(age1, Math.min(age2, age3));
     int tallest = Math.max(h1, Math.max(h2, h3));
     System.out.println("Youngest friend is " + youngest + " years old.");
     System.out.println("Tallest friend is " + tallest + " cm tall.");
    }
}
