import java.util.Scanner;
public class Height{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Height in Centimeters");
       double Cm = sc.nextDouble();
       double inch = Cm/2.54;
       double foot = inch/12;
       
       System.out.println("Your Height in cm is " + Cm + " while in feet is " + foot + " and inches is " + inch);
    }
}

