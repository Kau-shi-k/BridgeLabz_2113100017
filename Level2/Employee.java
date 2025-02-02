class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void modifySalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
            System.out.println("Salary updated to: " + newSalary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String team;

    public Manager(String employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Team: " + team);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee employee1 = new Employee("E123", "Finance", 50000);
        employee1.modifySalary(55000);
        employee1.displayEmployeeDetails();

        Manager manager1 = new Manager("M456", "HR", 75000, "HR Team A");
        manager1.displayManagerDetails();
    }
}
