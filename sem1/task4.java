package sem1;
import java.util.Scanner;

public class task4 {
    public static int fact(int n){
        if (n == 0){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("n: ");
        int n = iScanner.nextInt();
        System.out.println(fact(n));

    }
    
}
