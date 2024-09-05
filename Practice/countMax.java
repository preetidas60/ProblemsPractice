public class countMax {
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,0,0,1,2}; 
        System.out.println(maximumCount(arr));
    }
    public static int maximumCount(int[] nums) {
        int n = nums.length;
        int FirstPos = binarySearch(nums, 0, n-1, 1);
        int posCount = n - FirstPos;
        int FirstNeg = binarySearch(nums, 0, n-1, 0);
        int negCount = FirstNeg;
        return Math.max(posCount, negCount);
    }
    public static int binarySearch(int[] arr, int start, int end, int target){
        while(start<= end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                start = mid+1;
            }
            else {
                end = mid -1;
            }
        }
        return start;
    }
}
