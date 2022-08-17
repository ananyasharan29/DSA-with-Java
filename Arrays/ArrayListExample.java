//Arraylist is a Java collection framework
//it is slower than the standard array
//used when you don't know the size of an array
//In Arraylist not every single element can be primitive


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10); //Size is fixed internally, but it's being changed when particular capacity exceeds.
        //ArrayList is a class, start with capital letter
        //Integer is a wrapper class for primitive data type int
        //list is reference variable pointing to the object

/*        list.add(12);
        list.add(15);
        list.add(11);
        list.add(62);
        list.add(322);
        list.add(125);
        list.add(129);
        list.add(120);

        System.out.println(list.contains(62));
        System.out.println(list.contains(629));
        System.out.println(list);
        list.set(0,100);
        list.remove(1);

        System.out.println(list);

 */

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //pass index here, list[index] syntax will not work here
        }
        System.out.println(list);
    }
}
