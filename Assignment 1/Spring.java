import java.util.Scanner;
public class Spring{
  public static boolean isSpring(int month, int date){
    return (month == 3 && date >= 20) || (month == 4) || (month == 5) || (month == 6 && date <= 20);
  }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Month");
    int Mon = sc.nextInt();
    System.out.println("Enter Day");
    int Date = sc.nextInt();
    if(isSpring(Mon, Date)){
      System.out.println("Its a Spring Season");
    } else {
      System.out.println("Its not a Spring Season");
    }
  }
}
