import java.util.Arrays;

public class Arrayreverse {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // for(int i=0; i<arr.length; i++){
        //     int temp = arr[i];
        //     arr[i] = arr[arr.length-i-1];
        //     arr[arr.length-i-1] = temp;
        // }
        // System.out.println(Arrays.toString(arr));
        int[] arr = {2,3,1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));

    }
        public static void nextPermutation(int[] nums) {
            int index =-1;
            for(int i=nums.length-2; i>=0; i--){
                if(nums[i] < nums[i+1]){
                    index = i;
                    break;
                }
            }
            if(index== -1){
                reverse(nums,0,nums.length-1);
            }else{
                for(int i=nums.length-1; i>=index; i--){
                if(nums[i] > nums[index]){
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    break;
                }
                
            }
            reverse(nums, index+1, nums.length-1);
            }
            
        }
        public static void reverse(int[] arr, int start, int end){
            while(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
}
