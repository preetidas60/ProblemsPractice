public class BSrecursion {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,10,13,17,22,28};
        System.out.println(search(arr, 16, 0, arr.length-1));

        int num = 12385756;
        int sum =0;
        int k =2;
        while(k>0){
            while(num>0){
            int rem = num %10;
            sum+= rem;
            num/= 10;
            }
            k--;
        }
        System.out.println(sum);

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