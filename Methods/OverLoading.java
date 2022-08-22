//Method Overloading basically happens two or more functions of the same name they can exist if the parameters are different

public class OverLoading {
    public static void main(String[] args) {
//        fun(20);
//        fun("Ananya");
//        int ans = sum(12, 22,);
//        System.out.println(ans);
        int ans = sum(10, 20, 30);
        System.out.println(ans);
    }
    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }

    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }
}
