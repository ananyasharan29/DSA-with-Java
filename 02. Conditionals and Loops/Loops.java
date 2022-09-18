import java.util.Scanner;

//  loops are used to execute repeated statements
public class Loops {
    public static void main(String[] args) {

        /*There are three types of loops
        1. for loop
        2. while loop
        3. do-while loop
         */
         /*Syntax of for loop

            for(initialisation; condition; increment/decrement){
                    //body
            }
          */
        // Q. Print a numbers from 1 to 5
        for(int num = 1; num <= 5; num ++){      // num++ or num += 1
            System.out.println(num);
    }

        // Q. Print a numbers from 1 to n
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int num = 1; num <= n; num +=1){
            System.out.println("hello world");
        }

        /*syntax of while loop

            while(condition){
               //body
            }
         */
        // It is also called the "Exit controlled loop" because first it'll check the condition and then execute statement
        int a = 1;
        while(a<=5){
            System.out.println(a);
            a++;
        }

        /*syntax of do-while loop

            do{

            }while(condition);
         */
        // do-while is used when we want to execute the statement at least once
        // First it'll execute and then check the condition after that it'll execute only when while condition is true
        // It is also called the "Exit controlled loop" because it'll check the condition after the execution of statement
        int b = 1;
        do{
            System.out.println("Hello World");
        }while(b != 1);
    }
}
