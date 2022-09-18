import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = input.nextInt();

        int count = 0;
        while(n >0){
            int rem = n % 10;
            if(rem==5){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
