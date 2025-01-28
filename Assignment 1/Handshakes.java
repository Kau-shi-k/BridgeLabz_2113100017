import java.util.Scanner;
public class Handshakes{
  public static int hand(int s){
     int n = (s*(s-1))/2;
     return n;
  }
  public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Number Of Students");
     int std = sc.nextInt();
     System.out.println("The Maximum Number OF Handshakes is" + hand(std));
  }
}
