import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Name: ");
        String name = input.nextLine();

        System.out.println("Good Morning " + name);
        System.out.println("Good Afternoon " + name);
        System.out.println("Good Evening " + name);
        System.out.println("Good Night " + name);
    }
}
