//Shadowing in Java is basically a practice of using two variables with the same name within the scope that overlaps

public class Shadowing {
    //x is going to be available to everything that is inside the block of x
    //you can't use object dependent things in object independent things that's the reason why we use static over here
    //when you add the another variable in the scope that overlap, the variable with the higher level scope is hidden
    static int x = 50; //this will be shadowed at line 10 because the lower level is hiding the upper level, this is called shadowing
    public static void main(String[] args) {
        System.out.println(x);//50
        int x; // declaring// the class variable at line 7 is shadowed by this
//        System.out.println(x); //Scope will begin when value is initialised
        x = 40; //initialising
        System.out.println(x);//40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
//Shadowing effect doesn't take place in methods, this works for class variables.