import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b"); //For String object + operator is being overloaded, means it concatenates more than on Strings.
        System.out.println((char)('a' + 3));
        //If we do addition/ any mathematical operations on any two characters it converts it into its ASCII values in numbers and use it
        //With Strings its not doing that, using String value (concatenate).

        System.out.println("a" + 1);
        //NOTE: When an integer is concatenated with a String, it is converted to its wrapper class Integer.
        //this is same as after few steps : "a" + "1".
        //integer will be converted to Integer that will call toString().

        System.out.println("Ananya" + new ArrayList<>());
        System.out.println("Ananya" + new Integer(55));

//        System.out.println(new Integer(55) + new ArrayList<>());
        String ans = (new Integer(55) + " " + new ArrayList<>());
        System.out.println(ans);
        //The operator + in Java is only defines for primitives and with any one value is a String.
        //we can only use + operators with primitives and only with all the complex objects as well
        // but the only condition is that at least one of its object should be type string.

        System.out.println("a" + 'a');
    }
}
