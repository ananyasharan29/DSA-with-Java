public class Main {
    public static void main(String[] args) {

        int a = 10; //primitives stored in stack memory.
        int[] arr = {2,3,4,5,13}; //reference variable "arr" in stack and pointing to "{2,3,4,5,13}" this object in heap.

        String name = "Ananya Sharan"; //collection of character.
//        System.out.println(name);

        String b = "Ananya";
        System.out.println(b);
        b = "Sharan"; //here we aren't change the original object, we create new object
        System.out.println(b);
    }
}
