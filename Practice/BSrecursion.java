public class BSrecursion {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,10,13,17,22,28};
        System.out.println(search(arr, 16, 0, arr.length-1));
    }
    public static int search(int[] arr , int target, int start, int end){
        while(start<= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
}