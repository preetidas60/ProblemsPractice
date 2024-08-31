public class count0s {
    public static void main(String[] args) {
        System.out.println(countZeroes(20504, 0));
    }
    public static int countZeroes(int n, int count){
        if(n == 0){
            return count;
        }
        int rem = n% 10;
        if(rem == 0){
            return countZeroes(n/10, count+1);
        }
        return countZeroes(n/10, count);
    }
}
