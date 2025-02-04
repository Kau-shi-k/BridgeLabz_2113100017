public class Patienr {
    // Static variable shared among all patients
    private static String hospitalName = "City Hospital"; 
    private static int totalPatients = 0; // Static variable to count total patients
    
    // Instance variables
    private String name;
    private int age;
    private String ailment;
    private final String patientID; // Final variable for unique patient ID

    // Constructor using 'this' to initialize instance variables
    public Patienr(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++; // Increment total patient count when a new patient is created
    }

    // Static method to get total patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details, using 'instanceof' for verification
    public void displayDetails() {
        if (this instanceof Patienr) { // Checking if the object is an instance of Patient
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println();
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating Patient objects
        Patienr p1 = new Patienr("Alice", 30, "Flu", "P1001");
        Patienr p2 = new Patienr("Bob", 45, "Fever", "P1002");

        // Displaying patient details
        p1.displayDetails();
        p2.displayDetails();

        // Displaying total number of patients
        System.out.println("Total Patients Admitted: " + getTotalPatients());
    }
}
