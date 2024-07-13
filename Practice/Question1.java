import java.util.Scanner;


public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num & 1) == 1){
            System.out.println("NUmber is odd");
        } else {
            System.out.println("number is even");
        }
    }
    
}
