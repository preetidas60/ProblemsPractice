import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class longConsecutive {
    public static void main(String[] args) {
        int[] arr = {102,4,100,1,101,103,104,105,3,2,4};
        // After sorting arr = {1,2,3,4,4,100,101,102};
        System.out.println(longcons(arr));

    }
    public static int longcons(int[] nums){
        // Arrays.sort(nums);
        // int count=1;
        // int longest =1; int num = nums[0];
        // for(int i=1; i<nums.length; i++){
        //     if(num == nums[i]-1){
        //         count++;
        //         longest = Math.max(longest, count);
        //     }
        //     else if(nums[i] == num){
        //         continue;
        //     }
        //     else count =1; num = nums[i];
        // }
        // return longest;
        int count=1, longest =1;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        
        for(int i=0; i<set.size(); i++){
            if(set.contains(set.g))
        }
    }
}
