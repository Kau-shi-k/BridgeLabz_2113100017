import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Take user input for fromCity
        System.out.print("Enter your starting city: ");
        String fromCity = input.nextLine();

        // Take user input for viaCity
        System.out.print("Enter the city you will pass via: ");
        String viaCity = input.nextLine();

        // Take user input for toCity
        System.out.print("Enter your destination city: ");
        String toCity = input.nextLine();

        // Take user input for distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = input.nextDouble();

        // Take user input for time taken
        System.out.print("Enter the total time taken for the journey (in hours): ");
        double timeTaken = input.nextDouble();

        // Calculate total distance in miles
        double totalDistance = fromToVia + viaToFinalCity;

        // Calculate average speed in miles per hour
        double averageSpeed = totalDistance / timeTaken;

        // Display the result
        System.out.println("\nTravel Details:");
        System.out.println("Name: " + name);
        System.out.println("Starting City: " + fromCity);
        System.out.println("City Passed via: " + viaCity);
        System.out.println("Destination City: " + toCity);
        System.out.println("Total Distance (in miles): " + totalDistance);
        System.out.println("Total Time Taken (in hours): " + timeTaken);
        System.out.println("Average Speed (in miles per hour): " + averageSpeed);

        // Close the scanner
        input.close();
    }
}
