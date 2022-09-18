//BASIC
// Question no. 23

import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    /*    System.out.println("Enter any Number : ");
        int n = in.nextInt();

        for (int i =1; i<=n; i++){
            if (n % i == 0){
                System.out.println(i);
            }
        }

     */

        //Question no. 24
    /*    int sum = 0;
        int n = in.nextInt();
        while(n != 0) {
            sum = sum + n;
            n = in.nextInt();
        }
        System.out.println("Sum of all numbers is " +sum);

     */

        //Question no. 25
        int n = in.nextInt();
        int largest = n;
        while(n != 0) {
            n = in.nextInt();
            if(n > largest){
                largest = n;
            }
        }
        System.out.println("the largest number is " +largest);
    }
}
