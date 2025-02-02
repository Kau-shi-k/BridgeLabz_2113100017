public class Library {
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Constructor
    public Library(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true; // Initially, book is available
    }

    // Method to borrow a book
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is currently not available.");
        }
    }

    // Method to return a book
    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
        System.out.println(); // For spacing
    }

    public static void main(String[] args) {
        // Creating book objects in the library
        Library book1 = new Library("The Rainman", "Rainy", 500);
        Library book2 = new Library("Inferno", "Dan Brown", 800);

        // Displaying book details
        book1.displayDetails();
        book2.displayDetails();

        // Borrowing books
        book1.borrowBook();
        book1.borrowBook(); // Trying to borrow again

        // Returning book
        book1.returnBook();
        book1.returnBook(); // Trying to return again

        // Final details
        book1.displayDetails();
    }
}

