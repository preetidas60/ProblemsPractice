import java.util.Scanner;

public class character {
    public static void main(String[] args){
        // System.out.println("Enter a character");
        // Scanner sc = new Scanner(System.in);
        // char ch = sc.next().charAt(0);
        // if(ch >= 'a' && ch <='z'){
        //     System.out.println("lowercase");
        // }
        // else System.out.println("uppercase");
        int a = 0;
        int b = 1;
        int n = 7;
        while(n != 0){
            int fib = a + b;
            System.out.println(fib);
            a = b;
            b = fib;
            n--;
        }
    }
}
