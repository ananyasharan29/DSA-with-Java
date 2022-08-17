import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Enter operator: ");
        char c = input.next().charAt(0);
        if (c == '+')
            System.out.println("Sum = " + (a+b) );
        if (c == '-')
            System.out.println("Difference = " + (a-b) );
        if (c == '*')
            System.out.println("Product = " + (a*b) );
        if (c == '/')
            System.out.println("Quotient = " + (a/b) );

    }
}
