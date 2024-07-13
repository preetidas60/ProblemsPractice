public class digitcount {
    public static void main(String[] args){
        // int n = 16;
        // int count =0;
        // while(n != 0){
        //     count ++;
        //     n= n >> 1;
        // }
        // System.out.println(count);

        int n= 15;
        int base = 16;
        int digits = (int)(Math.log(n)/Math.log(base))+1;
        System.out.println(digits);
        System.out.println(Math.log(10)/Math.log(2));
    }
}
