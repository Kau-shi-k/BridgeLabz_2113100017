public class Pen{
   public static void main(String[] args) {
       int pens = 14;
       int std = 3;
       int penperstd = pens/std;
       int remaining = pens%std;
       System.out.println("The pen per Student is" + " " + penperstd);
       System.out.println("And the remaining pen not disturbed is" + " " + remaining);
   }
}
