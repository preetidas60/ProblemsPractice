import java.util.ArrayList;

public class countSteps {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3}; //start = 4 mid = 5
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
