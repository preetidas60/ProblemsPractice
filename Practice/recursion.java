public class recursion {
    public static void main(String[] args) {
        fibbonacci(6);
    }
    public static int fibbonacci(int n){
        if(n<2) return n;
        return fibbonacci(n-1)+ fibbonacci(n-2);
    }

}
