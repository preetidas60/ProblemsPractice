import java.util.ArrayList;
import java.util.List;

public class fibonacci {
    public static void main(String[] args){
        // int num1 =0;
        // int num2 = 1;
        // int result = 0;
        // for(int i=0; i<10; i++){
        //     result = num1 + num2;
        //     num1 = num2;
        //     num2 = result;
        //     System.out.println(result);
            
        // }

        int[] ar = {1,2,3};
        System.out.println(subset(ar));
    }
    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>());
        for(int num: arr){
            int n= list.size();
            for(int i=0; i<n; i++){
                List<Integer> internal = new ArrayList<>(list.get(i));
                internal.add(num);
                list.add(internal);
            }
        }
        return list;
    }
}
