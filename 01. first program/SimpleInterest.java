import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Principle Amount, Time, Rate: ");
        int priA = input.nextInt();
        float time = input.nextFloat();
        int rate = input.nextInt();

        float SI = (priA * time * rate)/100;
        System.out.println("Simple Interest is " +SI);

    }
}
