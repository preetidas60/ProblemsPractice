import java.util.ArrayList;

public class Arr2D {
    public static void main(String[] args) {
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
