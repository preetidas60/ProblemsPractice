import java.util.Arrays;

public class selection {
    public static void main(String[] args){
        int[] arr = {3,7,2,5,1,4};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    // public static void bubble(int[] arr){
    //     for(int i=0; i<arr.length-1; i++){
    //         for(int j=0; j<arr.length-i-1; j++){
    //             if(arr[j] > arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }
    // public static void selection1(int[] arr){
    //     for(int i=0; i<arr.length-1; i++){
    //         int smallest = i;
    //         for(int j=i+1; j<arr.length; j++){
    //             if(arr[smallest] > arr[j]){
    //                 smallest = j;
    //             }
    //         }
    //         int temp = arr[smallest];
    //         arr[smallest] = arr[i];
    //         arr[i] = temp;
    //     }
    // }
    

    public static void insertion(int[] arr){
        for(int i=1; i<arr.length; i++){
            int current =arr[i];
            int j= i-1;
            while(j>=0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }

}
