import java.util.Scanner;
public class PNZ{
  public static int range(int num){
    if(num>0){
      return 1;
    } else if(num<0) {
      return -1;
    } else{
       return 0;
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int num = sc.nextInt();
    System.out.println("The Given number is " + range(num));
  }
}
