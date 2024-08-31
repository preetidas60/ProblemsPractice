public class countMax {
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,0,0,1,2}; 
        System.out.println(maximumCount(arr));
    }
    public static int maximumCount(int[] nums) {
        int posCount = 0;
        int negCount = 0;
        int max = 0;
        int start = 0;
        int end = nums.length-1;
        while(start<= end){
            int mid = start + (end - start)/2;
            if(nums[mid] < 0){
                negCount = mid+1;
                start = mid+1;
                max = Math.max(max, negCount);
            }
            else if(nums[mid] == 0){
                start = mid +1;
                
            }
            else{
                posCount = nums.length - mid;
                end = mid-1;
                max = Math.max(max, posCount);
            }
        }
        return max;
    }
}
