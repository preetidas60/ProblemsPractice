import java.util.ArrayList;
import java.util.List;

public class subsetssss {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subsets(arr));
    }

    public static List<List<Integer>> subsets(int[] arr){
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
