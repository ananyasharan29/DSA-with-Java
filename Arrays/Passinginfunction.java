//Arrays are mutable in Java
//Mutable means you can change the object

import java.util.Arrays;

public class Passinginfunction {
    public static void main(String[] args) {
        int[] num = {2,4,7,9};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
