import java.util.Arrays;

public class rotateImage {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(Arrays.deepToString(rotate(arr)));
    }
    public static int[][] rotate(int[][] arr){
        int[][] matrix = new int[arr.length][arr[0].length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                 matrix[j][matrix.length-i-1] = arr[i][j] ;
            }
        }
        return matrix;
    }
}
