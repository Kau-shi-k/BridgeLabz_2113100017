public class Employee{
   private static String companyName = "Global";
   private static int totalEmployee = 0;
   private String name;
   private String desig;
   private final String id;


   public Employee(String name, String desig, String id){
	this.name = name;
	this.desig = desig;
	this.id = id;
	totalEmployee++;
   }


   public static void getTotalEmployee(){
	System.out.println("The Total Number of Employees are: " + totalEmployee);
   }


   public void Display(){
	System.out.println("The Company is: " + companyName);
	System.out.println("The Name of Employee is: " + name);
	System.out.println("The Designation is: " + desig);
	System.out.println("The Id is: " + id);
   }


   public static void main(String[] args){
	Employee employee1 = new Employee("Trinity", "Supervisor", "A1");
	Employee employee2 = new Employee("Butcher", "Intern", "D1");

	employee1.Display();
	employee2.Display();

	Employee.getTotalEmployee();
   }
}
