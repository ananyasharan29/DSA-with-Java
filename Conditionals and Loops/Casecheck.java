import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char c = input.next().trim().charAt(0); // .trim() means it will remove all the extra spaces from both ends of a string
        // charAt(0) means character at the given index of the string

        if(c>='a' && c<='z'){
            System.out.println("LowerCase");
        }else {
            System.out.println("UpperCase");
        }

     /*   String word = "Hello";
        System.out.println(word.charAt(2)); //charAt() returns the character type
      */

    }
}
