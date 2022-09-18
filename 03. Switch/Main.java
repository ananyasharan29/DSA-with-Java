 import java.util.Objects;
 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    /*    if (fruit.equals("mango")) { // .equals method basically compares the specified object and it only check the values.
            System.out.println("King of fruit");
        }
        if (fruit.equals("apple")) {
            System.out.println("a red sweet fruit");
        }
     */
        // In switch statements, you can jump to various cases based on your expression.

    /*    String fruit = in.next();
        switch (fruit) {   // alt + enter
            case "Mango" -> System.out.println("king of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruits");
            default -> System.out.println("Please Enter valid Fruit Name");
        }

     */

    /*    int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

     */

     /*   int day = in.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }

      */

        int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekend");
        }
        /* NOTE:
     - cases have to be the same type as expression, must be a constant or literal
     - duplicate case values are not allowed
     - break is used to terminate the sequence
     - if break is not used, it will continue to the next case
     - default will execute if none of the above execute
     - if default is not at the end, put break after it
         */
    }
}
