import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        //First Method
/*         int max = a;
         if(b>max){
             max=b;
         } if(c>max){
             max=c;
        }

 */
        //Second Method
  /*      int max=0;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        if(c>max){
            max=c;
        }
     */
        //Third Method
     /*   int max = Math.max(c, Math.max(a,b));
          System.out.println("The largest number is " +max);

      */

        //fourth method
        if (a > b) {
            if (a > c)
                System.out.println("Largest number is " + a);
            else
                System.out.println("Largest number is " + c);
        } else {
            if (b > c)
                System.out.println("Largest number is " + b);
            else
                System.out.println("Largest number is " + c);
        }
    }
}