public class Book{
   private static String libraryName = "Central";
   private String title;
   private String author;
   private final String isbn;
   

   public Book(String title, String author, String isbn){
	this.title = title;
	this.author = author;
	this.isbn = isbn;
   }

   public void Display(){
	if(this instanceof Book){
	   System.out.println("The Library is: " + libraryName);
	   System.out.println("The Title is: " + title);
	   System.out.println("The Author is: " + author);
	   System.out.println("The Isbn is: " + isbn);
	} else{
	   System.out.println("Invalid Details");
	}
   }

   public static void main(String[] args){
	Book book1 = new Book("The Rain Man", "Rainy", "#$%");
	Book book2 = new Book("Trinity", "Anonymous", "[(&");

	book1.Display();
	book2.Display();
   }
}
