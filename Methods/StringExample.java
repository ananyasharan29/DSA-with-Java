import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
    //   String message = greet();
    //   System.out.println(message);

    //   String personalised = myGreet("Ananya Sharan" );
    //    System.out.println(personalised);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = in.nextLine();
        String personalised = myGreet(name );
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message = "Hello " +name;
        return message;
    }

    static String greet(){
        String greeting ="How are you?";
        return greeting;
    }
}
