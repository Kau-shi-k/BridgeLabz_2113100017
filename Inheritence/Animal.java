public class Animal{
   private String name;
   private int age;

   public Animal(String name, int age){
	this.name = name;
	this.age = age;
   }

   public int getAge(){
	return age;
   }

   public void setAge(int age){
	this.age = age;
	
   }

   public void makeSound(){
	System.out.println("Animal makes a Sound");
   }
}

class Dog extends Animal{

   public Dog(String name, int age){
	super(name, age);
   }
   @Override
   public void makeSound(){
	System.out.println("The Dog Barks");
   }
}

class Cat extends Animal{
   public Cat(String name, int age){
	super(name,age);
   }
   @Override
   public void makeSound(){
	System.out.println("The Cat Meows");
   }
}

class Bird extends Animal{
   public Bird(String name, int age){
	super(name,age);
   }
   @Override
   public void makeSound(){
	System.out.println("The Bird Chirps");
   }
}

 class Main{
   public static void main(String[] args){
	Animal dog = new Dog("tom", 2);
	Animal cat = new Cat("whiskers",3);
	Animal bird = new Bird("chirpy",5);

	dog.makeSound();
	cat.makeSound();
	bird.makeSound();

	System.out.println("Dog's Age: "+ dog.getAge());
	dog.setAge(10);
	System.out.println("Dog's Age: "+ dog.getAge());

   }
}
