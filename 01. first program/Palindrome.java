import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String a = input.next();
        int n = a.length()-1;

        for (int i=0; i<=n; i++) {
            if (a.charAt(i) != a.charAt(n)) {
                System.out.println("String is not palindrome");
                return;
            }
            n = n - 1;
        }
                System.out.println("String is palindrome");
            }
        }
