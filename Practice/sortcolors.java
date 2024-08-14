import java.util.Arrays;

public class sortcolors {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int[] nums){
        int low =0, mid=0, high = nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
