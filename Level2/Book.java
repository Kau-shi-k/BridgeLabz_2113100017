public class Book{
   private String title;
   private String author;
   private int price;
   
   public Book(){
     this.title = "Anonymous";
     this.author = "AN";
     this.price = 1000;
   }
  
   public Book(String title, String author, int price){
      this.title = title;
      this.author = author;
      this.price = price;
   }

   public void Display(){
     System.out.println("The Name Is" + " " + title);
     System.out.println("The Author Is" + " " + author);
     System.out.println("The Price Is" + " " + price);
   }

   public static void main(String [] args){
      Book book1 = new Book();
      Book book2 = new Book("THE RAINMAN", "Rainy", 1000);
      book1.Display();
      book2.Display();
   }
}
