public class reverser {
    public static void main(String[] args) {
        System.out.println(palindrome(56));
        
    }
    public static int reverse(int n){
        int digit = (int)Math.log10(n)+1;
        return helper(n, digit);
    }
    public static int helper(int n, int digit){
        if(n== 0){
            return 0;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10, digit-1) + helper(n/10, digit-1);
    }
    public static boolean palindrome(int n){
        return n == reverse(n);
    }
}
