import java.util.ArrayList;

public class Arr2D {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(23);
        // list.add(68);
        // System.out.println(list.contains(23));
        // System.out.println(list.get(1));
        // System.out.println(list.size());
        // int large = list.get(0);
        // System.out.println(large);

        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8}, //8 = 13, 16 = 33 
            {9,10,11,12},
            {13,14,15,26}
        };
        int target = 11;
        int result = 0;
        int m = arr.length, n = arr[0].length; 
        int start = 0;
        int end = ((m*n))-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            int row = mid/n;
            int column = mid%n;
            if(arr[row][column] == target){
                System.out.printf("[%d],[%d]",row,column);;
                break;
            }
            else if(arr[row][column] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        int[] nums = {1,2,4,5};
        int x= 5;
        int xor1=0;
        int xor2=0;
        for(int i=0; i<x-1; i++){
            xor1 = xor1 ^ (i+1);
            xor2 = xor2 ^ nums[i];
        }
        xor1 = xor1^x;
        System.out.println(xor1 ^ xor2);
    }
}
