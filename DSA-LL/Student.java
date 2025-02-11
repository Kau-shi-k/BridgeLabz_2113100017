import java.util.*;

public class Student{
   private int rollNumber;
   private String name;
   private int age;
   private String grade;
   Student Next;

   public Student(int rollNumber, String name, int age, String grade){
	this.rollNumber = rollNumber;
	this.name = name;
	this.age = age;
	this.grade = grade;
	this.next = null;
   }

}

class StudentLinkedList{
   private Student head;

   public void addAtBeginning(int rollNumber, String name, int age, String grade){
	Student newStudent = new Student(rollNumber, name, age, grade);
	newStudent.next = head;
	head = newStudent;
	System.out.println("Student Added at the Beginning);
   }

   public void atTheEnd(int rollNumber, String name, int age, String grade){
	Student newStudent = new Student(rollNumber, name, age, grade);
	if(head == null){
	   head = newStudent;
	   System.out.println("Student added at the End");
	   return;
	}
	Student temp = head;
	while(temp.next != null){
	   temp = temp.next;
	}

	temp.next = newStudent;
	System.out.println("Student added at the End");
   }

   public void addAtPosition(int position, int rollNumber, String name, int age, String grade){
	if(position == 1){
	   addAtBeginning(rollNumber, name, age, grade);
	   return;
	}

	Student temp = head;
	for(i = 1; temp != null && i<position-1; i++){
	   temp = temp.next;
	}

	if(temp == null){
	   System.out.println("Student out of Bounds");
	   return;
	}
	newStudent.next = temp.next;
	temp.next = newStudent;
	System.out.println("Student added at position " + position);
   }

   public void deleteByRollNumber(int rollNumber){
	if(head == null){
	   System.out.println("List is Empty");
	   return;
	}

	if(head.rollNumber == rollNumber){
	   head = head.next;
	   System.out.println("Student Record Deleted");
	   return;
	}
	Student temp = head;
	while(temp.next != null && temp.next.rollNumber != rollNumber){
	   temp = temp.next;
	}
	if(temp.next == null){
	   System.out.println("Student not found"):
	   return;
	}

	temp.next = temp.next.next;
	System.out.println("Student Record Deleted");
   }

   public void searchByRollNumber(int rollNumber){
	Student temp = head;
	while(temp!=null){
	   if(temp.rollNumber == rollNumber){
		 System.out.println("Student Found: Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
		 return;
	   }
	   temp = temp.next;
	}
	System.out.println("student not found");
   }

   public void updateGrade(int rollNumber, String newGrade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                temp.grade = newGrade;
                System.out.println("Grade updated for Roll Number: " + rollNumber);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

   public void displayAll() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }
        Student temp = head;
        System.out.println("Student Records:");
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentLinkedList studentList = new StudentLinkedList();

        while (true) {
            System.out.println("\nStudent Record Management");
            System.out.println("1. Add Student at Beginning");
            System.out.println("2. Add Student at End");
            System.out.println("3. Add Student at Position");
            System.out.println("4. Delete Student by Roll Number");
            System.out.println("5. Search Student by Roll Number");
            System.out.println("6. Update Student Grade");
            System.out.println("7. Display All Students");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll1 = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name1 = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age1 = scanner.nextInt();
                    System.out.print("Enter Grade: ");
                    char grade1 = scanner.next().charAt(0);
                    studentList.addAtBeginning(roll1, name1, age1, grade1);
                    break;

                case 2:
                    System.out.print("Enter Roll Number: ");
                    int roll2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name2 = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age2 = scanner.nextInt();
                    System.out.print("Enter Grade: ");
                    char grade2 = scanner.next().charAt(0);
                    studentList.addAtEnd(roll2, name2, age2, grade2);
                    break;

                case 3:
                    System.out.print("Enter Position: ");
                    int pos = scanner.nextInt();
                    System.out.print("Enter Roll Number: ");
                    int roll3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name3 = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age3 = scanner.nextInt();
                    System.out.print("Enter Grade: ");
                    char grade3 = scanner.next().charAt(0);
                    studentList.addAtPosition(pos, roll3, name3, age3, grade3);
                    break;

                case 4:
                    System.out.print("Enter Roll Number to Delete: ");
                    int roll4 = scanner.nextInt();
                    studentList.deleteByRollNumber(roll4);
                    break;

                case 5:
                    System.out.print("Enter Roll Number to Search: ");
                    int roll5 = scanner.nextInt();
                    studentList.searchByRollNumber(roll5);
                    break;

                case 6:
                    System.out.print("Enter Roll Number to Update Grade: ");
                    int roll6 = scanner.nextInt();
                    System.out.print("Enter New Grade: ");
                    char newGrade = scanner.next().charAt(0);
                    studentList.updateGrade(roll6, newGrade);
                    break;

                case 7:
                    studentList.displayAll();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
