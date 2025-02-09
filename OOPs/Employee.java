import java.util.ArrayList;

abstract class Employee{
   private String employeeId;
   private String name;
   private double baseSalary;

   public Employee(String employeeId, String name, double baseSalary){
	this.employeeId = employeeId;
	this.name = name;
	this.baseSalary = baseSalary;
   }

   public String getEmployeeId(){
	return employeeId;
   }

   public String getName(){
	return name;
   }

   public double getBaseSalary(){
	return baseSalary;
   }

   public abstract double calculateSalary();

   public void displayDetails(){
	System.out.println("The Id Of the Employee is: " + employeeId);
	System.out.println("The Name Of the Employee is: " + name);
	System.out.println("The Salary of the Employee is: " + baseSalary);
	System.out.println("The Total Salary is: " + calculateSalary());
   }
}

interface Department{
   void assignDepartment(String departmentName);
   String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department{
   private double bonus;
   private String department;

   public FullTimeEmployee(String employeeId, String name, double baseSalary, double bonus){
	super(employeeId, name, baseSalary);
	this.bonus = bonus;
   }

   @Override
   public double calculateSalary(){
	return getBaseSalary() + bonus;
   }

   @Override
   public void assignDepartment(String departmentName){
	this.department = departmentName;
   }

   @Override
   public String getDepartmentDetails(){
	return "Department: " + department;
   }
}

class PartTimeEmployee extends Employee implements Department{
   private int workHours;
   private double hourlyRate;
   private String department;

   public PartTimeEmployee(String employeeId, String name, double baseSalary, int workHours, double hourlyRate){
	super(employeeId, name, baseSalary);
	this.workHours = workHours;
	this.hourlyRate = hourlyRate;
   }

   @Override
   public double calculateSalary(){
	return getBaseSalary() + (workHours * hourlyRate);
   }

   @Override
   public void assignDepartment(String departmentName){
	this.department = departmentName;
   }

   @Override
   public String getDepartmentDetails(){
	return "Department: " + department;
   }
}
class Main{
   public static void main(String[] args){
	ArrayList<Employee> employees = new ArrayList<>();
	
	FullTimeEmployee emp1 = new FullTimeEmployee("FE01", "Trinity", 50000, 1000);
	PartTimeEmployee emp2 = new PartTimeEmployee("PE01", "Butcher", 20000, 20, 500);

	emp1.assignDepartment("Serial Killer");
	emp2.assignDepartment("Killer");

	employees.add(emp1);
	employees.add(emp2);

	for(Employee emp : employees){
	   emp.displayDetails();

	   if(emp instanceof Department){
		System.out.println(((Department)emp).getDepartmentDetails());
	   }
	   System.out.println();
	}
   }
}


 
