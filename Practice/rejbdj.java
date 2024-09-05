import java.util.Arrays;

public class rejbdj {
    public static void main(String[] args) {
        int[] arr = {2,8,3,6,1};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        char c= 'a';
        int a = (int)c;
        System.out.println(a);
    }
    public static void merge(int[] arr, int start, int end){
          if(end - start == 1){
            return;
          }
          int mid = (start+end)/2;
          merge(arr, start, mid);
          merge(arr, mid, end);
          
          mergeSorts(arr, start,mid, end);
    }
    public static void mergeSorts(int[] arr, int start, int mid, int end){
        int[] nums = new int[end-start];
        int i=start;
        int j= mid;
        int k=0;
        while(i<mid && j<end){
            if(arr[i] < arr[j]){
                nums[k++] = arr[i++];
            }
            else{
                nums[k++] = arr[j++];
            }
        }
        while(i<mid){
            nums[k++] = arr[i++];
        }
        while(j<end){
            nums[k++] = arr[j++];
        }
        for(int l=0; l<nums.length; l++){
            arr[start+l] = nums[l];
        }
    }
    public static void quick(int[] arr, int low, int high){
        if(low>= high){
            return;
        }
        int s = low;
        int e= high;
        int mid = s+(e-s)/2;
        int pivot = arr[mid];
        while(s<=e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            if(s<= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quick(arr, low, e);
        quick(arr, s, high);
    }
}
