import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c=2;
        while(c*c <= num){
            if(num % c == 0){
                System.out.println("Not a prime number");
                return;
            }
            c++;
        }
        System.out.println("Prime number");
    }
}
