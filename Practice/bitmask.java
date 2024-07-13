public class bitmask {
    public static void main(String[] args){
        int n= 5;
        int pos = 2;
        int bit = 1<<pos;
        int output = ~(bit);
        bit = output & n;
        System.out.println(bit);
    }
}
