public class Circle{
   private double radius;
   
   public Circle(){
     this.radius = 1.0;
   }
 
   public Circle(double radius){
     this.radius = radius;
   }
   
   public double Area(){
     return Math.PI*radius*radius;
   }

   public void Display(){
     System.out.println("Area is" + Area());
   }

   public static void main(String[] args) {
      Circle circle1 = new Circle();
      Circle circle2 = new Circle(5.0);
      circle1.Display();
      circle2.Display();
   }
}
