import java.util.Arrays;
import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Array of primitives
        int[] arr = new int[5];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 55;
//      [11, 22, 33, 44, 55]
//        System.out.println(arr[3]);

        //input using for loops
//        for(int i=0; i< arr.length; i++){
//           arr[i] = in.nextInt();
//        }

//        System.out.println(Arrays.toString(arr));

//        for(int i=0; i< arr.length; i++){
//            System.out.print(arr[i] +" ");
//        }

        //Enhanced for loop/ for each loop
//        for(int num : arr){ //for every element in array, print the element
//            System.out.print(num + " ");//here num represents elements of the array
//        }

//        System.out.println(arr[5]); //index out of bound error

        //Array of objects
        String[] str = new String[4];
        for(int i = 0; i< str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str)); //this is storing reference variable to these objects [a, b, c, d]
        // and these objects are anywhere in the heap.

        //modify
        str[1] = "Ananya";
        System.out.println(Arrays.toString(str));
    }
}
