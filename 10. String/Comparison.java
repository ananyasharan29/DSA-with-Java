public class Comparison {
    public static void main(String[] args) {
        String a = "Ananya";
        String b = "Ananya";
        String c = a;

        System.out.println(c == a);
        // ==
//        System.out.println(a == b);

        String name1 = new String("Ananya");
        String name2 = new String("Ananya");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2)); //for values
    }
}
