import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

 //       while (true) {
            System.out.print("Enter the operator: ");
            char op = sc.next().charAt(0);

            int result = 0;
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                if (op == '+') {
                    result = num1 + num2;
                }
                if (op == '-') {
                    result = num1 - num2;
                }
                if (op == '*') {
                    result = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        result = num1 / num2;
                    }
                }
                if (op == '%') {
                    result = num1 % num2;
                  }
                } else if (op == 'x' || op == 'X') {
 //                   break;
                } else {
                    System.out.println("Invalid Operator.");
                }
                System.out.println(result);
            }
        }
 //   }

