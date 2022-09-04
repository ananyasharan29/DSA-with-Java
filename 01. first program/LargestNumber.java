import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();

        if (a>b){
            System.out.println("Largest number: " +a);
        }else{
            System.out.println("Largest number: " +b);
        }
    }
}
