import java.util.Arrays;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        int num = 6;
        String name = Integer.toString(num);
        System.out.println(name);
        String data = "14532";
        int nums = Integer.parseInt(data);
        System.out.println(nums);
        Scanner sc = new Scanner(System.in);
        name(12,45,67,56);
    }
    public static void name(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
