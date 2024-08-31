import java.util.ArrayList;

public class countSteps {
    public static void main(String[] args) {
        int[] arr = {1,4,5,4, 8,4,7676,3,9,4};
        int target = 4;
        System.out.println(search(arr, target,0));
    }
    public static ArrayList<Integer> search(int[] arr,int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> Answersfrombelow = search(arr, target, index+1);
        list.addAll(Answersfrombelow);
        return list;
    }
}
