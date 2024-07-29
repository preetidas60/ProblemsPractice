import java.util.Arrays;

public class hello {
    public static void main(String[] args) {
        int[] nums = {2,4,5,3,1};
        for(int i=1; i<nums.length; i++){
            int current = nums[i];
            int j = i-1;
            while(j>=0 && nums[j] > current){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = current;
        }
        System.out.println(Arrays.toString(nums));
    }
}
