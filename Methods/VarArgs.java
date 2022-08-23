import java.util.Arrays;

//variable length arguments is basically when you create the method that takes a variable number of arguments, it is known as variable arguments
//when we do not know how many inputs we are giving
public class VarArgs {
    public static void main(String[] args) {
//        fun(); //it will print empty array
//        fun(2, 3, 5, 9, 12, 44);
//        multiple(9,8, "Ananya", "Sweta", "Anushka");
//        multiple(2, "Ananya", "Sweta"); //you can not skip anything like this, ordering is very important
        demo(2,5,6);
        demo("Ananya", "Sweta", "Anushka");
//        demo(); //gives an error when you don't pass anything in case of varargs method overloading
    }
    //Method overloading
    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }

    //Variable Arguments
    static void fun(int...v){ //int...v is internally taken as Array of Integers
        System.out.println(Arrays.toString(v));
    }
    //Multiple Arguments
    static void multiple(int a, int b, String ...v) {
        //VarArgs always at the end, we can't write like this
        // "static void multiple(int a,String ...v, int b)" or "static void multiple(int a,int ...v, int b)"
        //It will give error

    }
}
