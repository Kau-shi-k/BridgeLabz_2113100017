public class Person{
   private String name;
   private int age;
 
   public Person(String name, int age){
     this.name = name;
     this.age = age;
   }
   public Person(Person other){
     this.name = other.name;
     this.age = other.age;
   }

   public void Display(){
      System.out.println("The Name Of the Person is" + " " + name);
      System.out.println("The Age of The Person is" + " " + age);
   }

   public static void main(String [] args){
     Person person1 = new Person("Ojas", 21);
     Person person2 = new Person(person1);
     person1.Display();
     person2.Display();
   }
}
