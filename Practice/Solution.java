import java.util.Arrays;
import java.util.Scanner;
class Solution{
    public static void main(String[] args){
        int[] arr = {4,1,2,1,4};
        System.out.println(singleNumber(arr));
        Scanner input = new Scanner(System.in);
        int a = 257;
        byte b = (byte)a;
        System.out.println(b);
    }
    static int singleNumber(int[] nums) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 1; i += 2) {
                if (nums[i] != nums[i + 1]) {
                    return nums[i];
                }
            }
            return nums[nums.length - 1];
    }

}