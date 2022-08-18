import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int EmpId = in.nextInt();
        String department = in.next();

        switch (EmpId) {
            case 1:
                System.out.println("Ananya Sharan");
                break;
            case 2:
                System.out.println("Sweta Agrawal");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department ");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println(" No Department");
                }
                break;
            default:
                System.out.println("Enter correct EmpId");
        }


        // better way to write
        switch (EmpId) {
            case 1 -> System.out.println("Ananya Sharan");
            case 2 -> System.out.println("Sweta Agrawal");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department ");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println(" No Department");
                }
            }
            default -> System.out.println("Enter correct EmpId");
        }
    }
}
