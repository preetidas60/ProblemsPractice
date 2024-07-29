import java.util.ArrayList;

public class Arr2D {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int[][] arr = new int[3][3];
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[i].length; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(Arrays.toString(arr[i]));
        // }
        // int[] arr = {4,56,87,65};
        // int large=arr[0], slarge = -1;
        // for(int i=1; i<arr.length; i++){
        //     if(arr[i] > large){
        //         slarge = large;
        //         large = arr[i];
        //     }
        //     else if(arr[i] < large && arr[i] > slarge){
        //         slarge = arr[i];
        //     }
        // }
        // System.out.println(large);
        // System.out.println(slarge);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(23);
        list.add(68);
        System.out.println(list.contains(23));
        System.out.println(list.get(1));
        System.out.println(list.size());
        int large = list.get(0);
        System.out.println(large);
    }
}
