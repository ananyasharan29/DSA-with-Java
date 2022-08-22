// In Java, we call functions as methods because if we call function in a class, then it is called a method.
//In Java, we put everything in classes.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Q. Take input of two numbers and print the sum
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter number 1 : ");
        num1 = in.nextInt();
        System.out.print("Enter number 2 : ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum = " +sum);

        //DRY means Don't Repeat Yourself
    }
}
