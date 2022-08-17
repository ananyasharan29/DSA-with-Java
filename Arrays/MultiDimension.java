import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        Two - D array is like matrix
            1 2 3
            4 5 6
            7 8 9
         */
//        int[][] arr = new int[3][]; //Number of rows is mandatory to specify, Number of column is not
//        mandatory to specify if you want you can specify.
        // left box = number of rows and right box = number of column.
        //Individual size of array can vary as well because each array itself is a different object that's why it is not
        //necessary to add number of column.
//        int[][] arr = {
//                {1, 2, 3}, //0th index is an array itself.
//                {4, 5}, //1st index is an array itself.
//                {6, 7, 8, 9}  //2nd index is an array itself.
//          };
        //It is stored in heap memory as "Array of arrays".

        int[][] arr = new int[3][2];
        System.out.println(arr.length); //no. of rows

        //input
       for (int row = 0; row < arr.length; row++) {
            //for each column in every row
           for (int col = 0; col < arr[row].length; col++) {
               arr[row][col] = in.nextInt();
           }
        }

        //output
        //1st way
 /*       for (int row = 0; row < arr.length; row++) {
            //for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); //prints new line
        }
  */
        //2nd way
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //3rd way
        for (int[] a: arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
