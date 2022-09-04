import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World");
       // System.out.print("Hello Everyone. "); //If you don't want new line you can just write "print"
        //System.out.println("My name is Ananya ");
        Scanner input = new Scanner(System.in);
        //System.out.println(input.nextInt());//for integers
        //System.out.println(input.next());//for first string
        System.out.println(input.nextLine());//for all strings present in a line
    }
}
//package is a folder in which your java file lies
//System has a variable called out which is of type printStream and out has a method called println
//System.out means Standard output stream that is command line
//System.in means Standard input stream that is your keyboard
