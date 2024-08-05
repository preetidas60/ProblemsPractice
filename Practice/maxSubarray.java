public class maxSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1-3,1,4,-1,2,1,-5};
        System.out.println(maxSubarray(arr));
    }
    public static int maxSubarray(int[] arr){
        int max =0;
        for(int i=0; i<arr.length; i++){
            int sum =0;
            for(int j=i; j<arr.length; j++){    
                sum+= arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}