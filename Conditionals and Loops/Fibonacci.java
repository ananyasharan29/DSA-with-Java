import java.util.Scanner;

// Find the nth fibonacci number
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n numbers: ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        int i = 2;

        while(i <= n){
            int temp = b;
            b = b + a;
            a = temp;
            i++;
        }
        System.out.println(b);
    }
}
