public class Employee{
   private String name;
   private String id;
   private double salary;

   public Employee(String name, String id, double salary){
	this.name = name;
	this.id = id;
	this.salary = salary;
   }

   public void Display(){
	System.out.println("The Employee Name is: " + name);
	System.out.println("The Employee id is: " + id);
	System.out.println("The Employee Salary is: " + salary);
   }
}

class Manager extends Employee{
   private int teamSize;

   public Manager(String name, String id, double salary, int teamSize){
	super(name, id, salary);
	this.teamSize = teamSize;
   }

   @Override
   public void Display(){
	super.Display();
	System.out.println("The Manager's TeamSize is: " + teamSize);
   }
}

class Developer extends Employee{
   private String language;

   public Developer(String name, String id, double salary, String language){
	super(name, id, salary);
	this.language = language;
   }

   @Override
   public void Display(){
	super.Display();
	System.out.println("The Developer's Programming Language is: " + language);
   }
}

class Intern extends Employee{
   private String duration;

   public Intern(String name, String id, double salary, String duration){
	super(name,id,salary);
	this.duration = duration;
   }
   @Override
   public void Display(){
	super.Display();
	System.out.println("The Duration Intern is on: " + duration);
   }
}
class Main{
   public static void main(String[] args){
	Employee manager = new Manager("Trinity", "M01", 100000, 3);
	Employee developer = new Developer("Butcher", "B01", 10000, "KILL");
	Employee intern = new Intern("DoomsDay", "D01", 1000, "3 Months");

	manager.Display();
	developer.Display();
	intern.Display();
   }
}
