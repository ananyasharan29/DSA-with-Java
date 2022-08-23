import java.util.Scanner;

public class Sum  {
    public static void main(String[] args) {
        //main function is the first function that is going to be run

        // sum();  //calling the function, You call the function via braces
        // you can call the sum function many times as you want

    //    int ans = sum2();
    //    System.out.println(ans);
        int ans = sum3(20, 40);
        System.out.println(ans);
    }
    //Static means it does not depend on the object.
    //Anything you want to use in static that also has to be static

    //return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum; //return basically means this function will end i.e., function over that's why return statements are at the end

     //   System.out.println("This will never execute"); //will not execute after return statement
    }
    static void sum(){
        //you can also pass things in the braces that is known as parameters (like arguments)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " +sum);
    }

    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
    /*
       SYNTAX
             return_type name (arguments) {
                //body
             return statement;
     */
}
