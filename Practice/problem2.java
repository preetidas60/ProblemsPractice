import java.util.Arrays;

public class problem2 {
    public static void main(String[] args){
        int[] arr = {2,2,3,2,7,8,8,7,7,8};
        System.out.println(findNum(arr));
    }
    static int findNum(int[] arr){
        int result =0;
        for(int i=0; i<arr.length; i++){
            result = result + arr[i];
        }
        int sum = result % 3;
        return sum;
    }
}
