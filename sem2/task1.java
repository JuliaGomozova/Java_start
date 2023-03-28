package sem2;
import java.util.Scanner;

public class task1 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String str = "4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7";
        System.out.println("enter number to find");
        char ch = scan.next().charAt(0);

        System.out.println(str.indexOf(ch));
        System.out.println(str.lastIndexOf(ch));
    }
}
