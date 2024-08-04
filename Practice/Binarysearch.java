import java.util.ArrayList;
import java.util.List;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        // int start = 0;
        // int end = arr.length-1;
        // int target = 16;
        // int ans = 0;
        // while(start<= end){
        //     int mid = start + (end - start)/2;
        //     if(arr[mid] == target){
        //         System.out.println(mid);
        //         return;
        //     }
        //     else if(target > arr[mid]){
        //         start = mid+1;
        //     }
        //     else{
        //         end = mid-1;
        //     }
        // }
        int n= arr.length;
        int subsets = 1 << n;
        List<List<Integer>> allSubsets = new ArrayList<>();
        for(int i=0; i<subsets; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<n; j++){
                if((i & (1<<j)) !=0){
                    list.add(arr[j]);
                }
            }
            allSubsets.add(list);
        }
    }
}