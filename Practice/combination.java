public class combination {
    public static void main(String[] args) {
        int row = 5;
        int column = 2;
        System.out.println(pascal(row, column));

    }
    public static int pascal(int r, int c){
        int res=1;
        for(int i=0; i<c; i++){
            res = res* (r-i);
            res = res/(i+1);
        }
        return res;
    }
}
