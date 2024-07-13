public class fibonacci {
    public static void main(String[] args){
        int num1 =0;
        int num2 = 1;
        int result = 0;
        for(int i=0; i<10; i++){
            result = num1 + num2;
            num1 = num2;
            num2 = result;
            System.out.println(result);
            
        }
    }
}
