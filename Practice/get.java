public class get {
    public static void main(String[] args){
        // int a = 5;
        // int b = 1;
        // b= b << 2;
        // if((a & b) == 0){
        //     System.out.println("bit is 0");
        // }
        // else{
        //     System.out.println("bit is 1");
        // }
        int n = 6;
        int ans = 0;
        int base = 5;

        while(n>0){
            int lsb = n & 1;
            ans = ans + lsb * base;
            n = n>>1;
            base *= 5;
        }
        System.out.println(ans);
    }
}
