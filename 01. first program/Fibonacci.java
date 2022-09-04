import java.util.Scanner;
// The Fibonacci series is a series where the next term is the sum of the previous two terms.
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 1;

        System.out.println("Enter the n number: ");
        int nNumber = input.nextInt();

           for (int i = 1; i <= nNumber; ++i) {
            System.out.print(" " +a);
            int c = a + b;
            a = b;
            b = c;
       }
    }
}
