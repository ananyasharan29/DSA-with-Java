
public class MaxItem {
    public static void main(String[] args) {
    /*    int[] arr = {2, 39, 81, 42, 11};
        System.out.println(max(arr));
    }

    //imagine that arr is not empty
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

     */
        //in between range
    int[] arr = {2, 39, 81, 92, 30};
        System.out.println(maxRange(arr, 1, 4));
}
    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
