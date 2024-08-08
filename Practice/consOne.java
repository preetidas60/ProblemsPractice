public class consOne{
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,1,1,0,0,0,0,1,1,1};
        System.out.println(find(arr));
    }
    public static int find(int[] arr){
        int count=0;
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
                max = Math.max(max, count);
            }else{
                count=0;
            }
            
        }
        return max;
    }
}
