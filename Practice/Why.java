import java.util.ArrayList;
import java.util.Scanner;

class Why{
    public static void main(String[] args){
        // Scanner input = new Scanner(System.in);
        // int num1 = input.nextInt();
        // int num2 = input.nextInt();
        // System.out.println(num1+num2);
        // int n = 12;
        // int b = n>> 1;
        // System.out.println(b);
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