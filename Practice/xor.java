import java.util.ArrayList;
import java.util.Scanner;

public class xor {
    public static void main(String[] args){
        // int a = 0;
        // int b = 2;
        // System.out.println(a^b);
        int a = 10; //1010
        a = a << 1; //0100
        System.out.println(a);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            arr.add(new ArrayList<>());
        }
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                arr.get(i).add(sc.nextInt());
            }
        }
        System.out.println(arr);

    }
}
