import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = input.nextInt();

        int count =0;
        while(n>0){
            n = n/10;
            count++;
        }
        int sum=0;
        int cube = sum + (n*n*n);

            if (sum==cube){
                System.out.println("Entered  number is an Armstrong ");
            }else{
                System.out.println("Entered number is not an Armstrong ");
            }
        }
    }

