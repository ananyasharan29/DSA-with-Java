// Strings are immutable means you can not change or modified them.

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //Swapping of two numbers
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a,b);
        System.out.println(a+ " " +b);

        String name = "Ananya Sharan";
        changeName(name);
        System.out.println(name);

    }

     static void changeName(String name) {
        name = "Sweta Agrawal"; // creating a new object not modifying.
    }
    //For primitives, it's just pass by value that's why the original value does not change.
    //For objects, it's passing value of the reference variable that's why original values change.


   static void swap(int num1, int num2)  {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        //this change will be valid in this function scope only.
    }

    // If you want to access anything that is defined in function, you can only access those things from that function.
    //You can't access those things from outside the function, This is called "Scoping".
}
