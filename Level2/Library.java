public class Library {
    private String title;
    private String author;
    private double price;
    private boolean available;
    public Library(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is currently not available.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
        System.out.println(); 
    }

    public static void main(String[] args) {
        Library book1 = new Library("The Rainman", "Rainy", 500);
        Library book2 = new Library("Inferno", "Dan Brown", 800);
        book1.displayDetails();
        book2.displayDetails();
        book1.borrowBook();
        book1.borrowBook();
        book1.returnBook();
        book1.returnBook(); 
        book1.displayDetails();
    }
}

