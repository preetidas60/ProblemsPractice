public class problem1 {
    public static void main(String[] args){
        int[] arr = {1,4,3};
        System.out.println(specialPerm(arr));
    }
    static int specialPerm(int[] nums) {
        int count =0;
        for(int i=0; i<nums.length-1; i++){
            if((nums[i] % nums[i+1] == 0) || (nums[i] % nums[i+1] == nums[i])){
                count++;
            }
        }  
        return count;      
    }
}
