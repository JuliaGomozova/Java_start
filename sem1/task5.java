package sem1;
import java.util.Scanner;

public class task5 {

    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("a:");
        int a = iScanner.nextInt();
        System.out.printf("b: ");
        int b = iScanner.nextInt();
        System.out.printf("c: ");
        int c = iScanner.nextInt();
        for(int i = a; i >= b; i -= 2){
            System.out.println(i);
        }
    }
    
}
