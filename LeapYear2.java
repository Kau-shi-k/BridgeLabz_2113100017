import java.util.Scanner;
public class LeapYear2{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Year and it should be greater than 1582");
     int year = sc.nextInt();
     if(year>1582 && (year%4==0 && (year%400==0 || year%100!=0))){
         System.out.println("The year is a Leap Year");
     } else {
          System.out.println("It is not a Leap Year");
     }
     
     sc.close();
  }
}
