import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
        static void moveZeroes(int[] nums) {
            int k =0;
            int j= nums.length-1;
            for(int i=0; i<nums.length-1; i++){
                
                if(nums[i] == 0){
                    nums[k] = nums[i+1];
                    nums[j] = 0;
                    k++;
                    j--;
                }
            }
        }
}
