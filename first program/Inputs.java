import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.print("Please enter some input: ");
        //int rollno = input.nextInt();
        //System.out.println("Your roll number is " +rollno);

        //int a = 10;
        //here 'a' is reference variable called identifier and '10' is object called literal
        //In primitive data types literals are the syntactical representation of like boolean, character or numeric

        //int a = 234,000,000;
        // here comma is not allowed for millions because it is not correct in terms of the syntax, instead of comma we can put underscore for millions
        int a = 234_000_000;
        System.out.println(a);

        String name = input.nextLine();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
//debugging where you can see how each and every single line is working