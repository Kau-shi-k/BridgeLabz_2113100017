public class Student{
   private static String university = "Hogwarts";
   private static int totalStudents = 0;
   private String name;
   private String grade;
   private final int rollNumber;


   public Student(String name, String grade, int rollNumber){
	this.name = name;
	this.grade = grade;
	this.rollNumber = rollNumber;
	totalStudents++;
   }


   public static void getTotalStudents(){
	System.out.println("Total Number of Students are: " + totalStudents);
   }


   public void Display(){
	System.out.println("The University is: " + university);
        System.out.println("The Students Name is: " + name);
        System.out.println("The Students Grades are: " + grade);
        System.out.println("The Roll Number is: " + rollNumber);
   }


   public static void main(String[] args){
	Student student1 = new Student("Trinity", "A", 1);
	Student student2 = new Student("Butcher", "A+", 5);

	student1.Display();
	student2.Display();

	Student.getTotalStudents();
   }
}
