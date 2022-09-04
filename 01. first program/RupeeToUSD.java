import java.util.Scanner;

public class RupeeToUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter Currency in Rupees: ");
        float rupee = input.nextFloat();

        double usd = (rupee * 0.013);
        System.out.println("In USD form: " +usd);
    }
}
