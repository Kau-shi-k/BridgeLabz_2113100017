import java .util.Scanner;
public class LeapYear{
   public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Year, it should be greater than 1582");
      int year = sc.nextInt();
      if(year < 1582){
         System.out.println("The Year is not valid");
      } else{
         if(year%4==0){
            if(year%100!=0){
                System.out.println("The Given Year is A Leap Year");
            }
            else if(year%400==0){
                  System.out.println("The Given Year is A Leap Year");
                }
            else{
                  System.out.println("The Given Year is Not a Leap Year");
                }
          }
          else{
               System.out.println("The Given Year is not a  Leap Year");
          }
      }
   }
}
