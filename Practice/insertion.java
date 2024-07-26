public class insertion {
    public static void main(String[] args) {
        int[] nums = {6,8,5,9,3,1,2};
        for(int i=1; i<nums.length; i++){
            int current = nums[i];
            int j = i-1;
            while(j>=0 &&  current < nums[j] ){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = current;
        }
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
