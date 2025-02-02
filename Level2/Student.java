class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPostgraduateDetails() {
        displayStudentDetails();
        System.out.println("Specialization: " + specialization);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Ojas", 8.5);
        student1.displayStudentDetails();

        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Kaushik", 9.0, "VLSI");
        pgStudent.displayPostgraduateDetails();
    }
}
