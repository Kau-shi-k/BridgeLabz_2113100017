public class Bank{
   private static String bankName = "Global";
   private static int totalAccounts = 0;
   private String accountName;
   private final int accountNumber;


   public Bank(String accountName, int accountNumber){
	this.accountName = accountName;
	this.accountNumber = accountNumber;
	totalAccounts++;
   }

   public static void getTotalAccounts(){
	System.out.println("The Total Number Of Accounts are: " + totalAccounts);
   }

   public void Display(){
	if(this instanceof Bank){
	   System.out.println("The Bank is: " + bankName);
	   System.out.println("The Account Name is: " + accountName);
	   System.out.println("The Account Number is: " + accountNumber);
	} else {
	   System.out.println("Invalid Account Details");
	}
   }


   public static void main(String[] args){
	Bank bank1 = new Bank("John", 01);
	Bank bank2 = new Bank("Wick", 02);

	bank1.Display();
	bank2.Display();

	Bank.getTotalAccounts();
   }
}
