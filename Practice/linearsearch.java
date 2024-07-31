import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {5,67,83,93,119,150,200};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for(int i=4; i<7; i++){
            if(arr[i] == target){
                target = 1;
                System.out.println("element found at index no." + i);
            }
        }
        if(target != 1){
            System.out.println("element not found");
        }
        sc.close();
    }
}
