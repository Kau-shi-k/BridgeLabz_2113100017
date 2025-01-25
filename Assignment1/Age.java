import java.util.Scanner;
public class Age{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int [] age = new int[3];
        int [] height = new int[3];

        for(int i =0; i < 3; i++){
            System.out.println("Enter the Age of" + (i +1));
            age[i] = sc.nextInt();
            System.out.println("Enter the height of" + (i +1));
            height[i] = sc.nextInt();
        }
        
        int youngest = 0;
        for(int i =0; i<3; i++){
           if(age[i]<age[youngest]){
            youngest = i;
            System.out.println("The Youngest age is" + age[youngest]);
           }
        }

        int tallest = 0;
        for(int i =0; i<3; i++){
           if(height[i]>height[tallest]){
            tallest = i;
            System.out.println("The tallest  is" + height[tallest]);
           }
        }
    }
    
}
