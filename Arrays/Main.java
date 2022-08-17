//Array is a collection of same data types.
//Index means the position of array which start from 0.

//In C/C++, there is continuous memory allocation in case of array.
//In Java, array object may not be continuous, it depends upon JVM.

//reference variables/primitives are stored in stack but array objects are in heap memory.
public class Main {
    public static void main(String[] args) {
        //Q. Store a roll number
        int a = 20;

        //Q. Store a person's name
        String name = "Ananya Sharan";

        //Q. Store 5 roll numbers
        int rno1 = 1;
        int rno2 = 2;
        int rno3 = 3;
        int rno4 = 4;
        int rno5 = 5;
        //If you want to store 500 roll numbers it is not possible to write 500 variables that's why we need array

        //Syntax :
        //datatype[] variable_name = new datatype[size];
        //Q. Store 5 roll numbers
//       LHS happens at compile time and RHS happens at run time
//        int[] rno = new int[5];
        //or directly
//        int[] rnos = {2, 5, 7, 11, 9};
        //1. this datatype basically represent what is the type of data stored inside the array

//        int[] rnumber = {2, 5, 7, "Ananya", 9}; //You can't write like that
        //2.All the type of the data in the array should be the same, you can't mix data types

        int[] ros; //declaration of array, ros is getting defined in the stack at compile time
        ros = new int[5]; //initialisation: actually here object is being created in the memory (heap) at run time
       //internally it is like [0, 0, 0, 0, 0]
//        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[2]); //by default, for every reference variable if there is no value, it's null type
        //Null is not a object not a data types it's just a special literal


    }
}
