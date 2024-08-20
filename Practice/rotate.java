import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        k = k % arr.length;
        ro(arr, 0, arr.length-1); 
        ro(arr, 0, k-1);
        ro(arr, k, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void ro(int[] arr, int start, int end){
        while(start<=end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
        }
    }
}
