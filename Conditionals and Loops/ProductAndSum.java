import java.util.Scanner;

public class ProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the integer");
        int n = in.nextInt();

        int product = 1;
        int sum = 0;
        while (n>0) {
            product = product*(n%10);
            sum = sum+(n%10);
            n = n/10;
        }

        int subtraction = product - sum;
        System.out.println("Subtraction of product and sum of an integer : " +subtraction);
    }
}
