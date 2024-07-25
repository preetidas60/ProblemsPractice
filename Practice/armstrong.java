public class armstrong {
    public static void main(String[] args){
        for(int i=0; i<1000l; i++){
            if(armStrong(i)){
                System.out.println(i);
            }
        }
        int[] name = new int[6];
        int[] rnos = {1,2,3,4,5,6};
    }
    static boolean armStrong(int n){
        int original = n;
        int cube = 0;
        while(n > 0){
            int rem = n % 10;
            cube = cube + rem * rem * rem;
            n /= 10;
        }
        return cube == original;
    }
    
}
