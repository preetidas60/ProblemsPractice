import java.util.Scanner;

public class trim {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        System.out.println(ch);

    }
}
