import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int l = sc.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int b = sc.nextInt();

        float Area = l*b;
        System.out.println("Area of Rectangle: " +Area);
    }
}
