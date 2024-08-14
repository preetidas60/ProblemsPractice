import java.util.Arrays;

public class arrange {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int m=0;
        int n=1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > 0){
                if(i%2==0){
                    m=m+2;
                }
                else{
                    int temp = arr[i];
                arr[i] = arr[m];
                arr[m] = temp;
                m = m+2;
                }
            }
            else{
                int temp = arr[i];
                arr[i] = arr[n];
                arr[n] = temp;
                n+=2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
