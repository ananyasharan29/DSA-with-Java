//In Java, there is no particular thing known as 'pass by reference', there is only 'pass by value'.
//Value of referenced variable is passed.
public class PassingExample {
    public static void main(String[] args){
        String name = "Ananya Sharan";
        greet(name);
    }

     static void greet(String naam) {
        System.out.println(naam);
    }
}
