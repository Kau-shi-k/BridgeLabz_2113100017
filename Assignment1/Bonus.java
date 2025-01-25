import java.util.Scanner;
public class Bonus{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double [] salary = new double[10];
        double [] yearsofservice = new double[10];
        double [] bonus = new double[10];
        double [] newsalary = new double[10];
        double totaloldsalary = 0, totalbonus = 0, totalnewsalary = 0;

        for(int i = 0; i<10; i++ ){
            System.out.println("Enter the salary of employee" + (i + 1) + ":");
            double tempsalary = sc.nextDouble();
            System.out.println("Enter the Number of Years Employee" + (i+1) + ":");
            double tempyear = sc.nextDouble();

            if(tempsalary <= 0 || tempyear <0){
                System.out.println("Invalid Input, Please Enter Again");
                i--;
                continue;
            }

            salary[i] = tempsalary;
            yearsofservice[i] = tempyear;
        }

        for(int i =0; i<10; i++){
            if(yearsofservice[i] > 5){
                bonus[i] = salary[i]*0.05;
            } else {
                bonus[i] = salary[i]*0.02;
            }

            newsalary[i] = salary[i] + bonus[i];
            totaloldsalary += salary[i];
            totalbonus += bonus[i];
            totalnewsalary += newsalary[i];
            
        }

        System.out.println("Total Old Salary: " + totaloldsalary);
        System.out.println("Total Bonus Payout: " + totalbonus);
        System.out.println("Total New Salary: " + totalnewsalary);
    }
}
