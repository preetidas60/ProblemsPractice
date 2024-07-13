import java.util.Scanner;

public class pow2 {
    public static void main(String[] args){
        Scanner take = new Scanner(System.in);
        int input = take.nextInt();
        int count = 0;
        while(input > 0){
            
            if((input & 1) == 1){
                count ++;
            }
            input = input >> 1;
        }
        if(count == 1){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("not a power of 2");
        }
    }
}
