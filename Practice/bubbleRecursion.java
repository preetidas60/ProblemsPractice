import java.util.Arrays;

public class bubbleRecursion {
    public static void main(String[] args){
        int[] arr = {3,6,8,4,5,1};
        sort(arr, 5, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int i, int j){
        if(i == 0){
            return;
        }
        if(i > j){
            if(arr[j] > arr[j+1]){
            int temp = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = temp;
            }
            sort(arr, i, j+1);
        }
        else{
            sort(arr, i-1, 0);
        }
    }
}
