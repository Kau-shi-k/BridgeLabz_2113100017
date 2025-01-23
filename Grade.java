import java.util.Scanner;
public class Grade{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Physics, Chemistry And Maths Marks");
      float phy = sc.nextFloat();
      float chem = sc.nextFloat();
      float mat = sc.nextFloat();
      float sum = phy + chem + mat;
      float average = sum/3.0f;
      float percentge = (sum/300)*100;
      if(percentge >= 80){
          System.out.println("Grade is A, Above normalized Standards");
          System.out.println("The Average Marks are," + average);
       } else if(percentge >=70){
          System.out.println("Grade is B, normalized Standards");
          System.out.println("The Average Marks are," + average);
       } else if(percentge >=60){
          System.out.println("Grade is C, Approaching normalized Standards");
          System.out.println("The Average Marks are," + average);
       } else if(percentge >=50){
          System.out.println("Grade is D, below normalized Standards");
          System.out.println("The Average Marks are," + average);
       } else if(percentge >=40){
          System.out.println("Grade is E, below normalized Standards");
          System.out.println("The Average Marks are," + average);
       } else {
          System.out.println("Grade is R, Remedial Standards");
          System.out.println("The Average Marks are," + average);
       }


    }
}
