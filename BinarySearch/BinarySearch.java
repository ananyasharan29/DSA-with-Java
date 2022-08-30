public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12, -8, -1, 2, 4, 7, 11, 14, 23, 45, 50};
        int target = 11;


        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start= 0;
        int end = arr.length - 1;

        while(start <= end){
            //find the middle element
//            int mid = (start + end) /2; //might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid +1;
            }else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
