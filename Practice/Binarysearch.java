import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Binarysearch {
    public static void main(String[] args) {
        // int[][] arr = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        // int m = arr.length;
        // int n = arr[0].length;
        // int result[]= new int[2];
        // int target = 8;
        // int start = 0;
        // int end = (m*n)-1;
        // while(start<=end){
        //     int mid = start+ (end - start)/2;
        //     int row = mid/arr.length;
        //     int col = mid % arr.length;
        //     if(arr[row][col] == target){
        //         result[0] = row;
        //         result[1] = col;
        //         break;
        //     }
        //     else if(arr[row][col] > target){
        //         end = mid -1;
        //     }
        //     else {
        //         start = mid+1;
        //     }
        // }
        // System.out.println(Arrays.toString(result));

        StringBuilder str = new StringBuilder();
        for(int i=0; i<26; i++){
            char ch = (char)('a'+i);
            str.append(ch);
        }
        System.out.println(str.toString());
        System.out.println(str.reverse());
        System.out.println(str.deleteCharAt(0));
        System.out.println(str.subSequence(0,13));
        System.out.println(str);
    }
}