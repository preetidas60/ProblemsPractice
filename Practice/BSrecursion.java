public class BSrecursion {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,10,13,17,22,28};
        System.out.println(search(arr, 28, 0, arr.length-1));
    }
    public static int search(int[] arr,int target, int start, int end){
        if(start > end) return -1;
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return search(arr, target, start, mid-1); 
        }
        return search(arr, target, mid+1, end);
    }
}
