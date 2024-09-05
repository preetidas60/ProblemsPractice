import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 2, 1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    public static int[] merge(int[] first, int[] second){
        int[] arr = new int[first.length + second.length];
        int i=0;
        int j=0; 
        int k=0;

        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                arr[k++] = first[i++];
            }
            else{
                arr[k++] = second[j++];
            }

        }
        while(i<first.length){
            arr[k++] = first[i++];
        }
        while(j<second.length){
            arr[k++] = second[j++];
        }
        return arr;
    }
}
