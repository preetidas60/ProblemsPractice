import java.util.Arrays;

public class selectionRecursion {
    public static void main(String[] args) {
        int[] arr = {5,9,6,3,4,1};
        sort(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int i, int j, int largest){
        if(i == 0){
            return;
        }
        if(i > j){
            if(arr[j] > arr[largest]){
                sort(arr, i, j+1, j);
            }
            else{
                sort(arr, i, j+1, largest);
            }
        }
        else{
            int temp = arr[largest];
            arr[largest] = arr[j];
            arr[j] = temp;
            sort(arr, i-1, 0, 0);
        }
    }
}