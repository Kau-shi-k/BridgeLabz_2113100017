public class Handshakes{
   public static void main(String [] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of handshakes among " + n + " students is " + handshakes);
    }
}
