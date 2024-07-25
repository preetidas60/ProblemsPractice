import java.util.Scanner;

public class holy {
    public static void main(String[] args){
        System.out.println("Enter a day");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1 -> System.out.println("SUnday");
            case 2 -> System.out.println("MOnday");
            case 3 -> System.out.println("Wednesday"); 
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid number"); 
        }
    }
}
