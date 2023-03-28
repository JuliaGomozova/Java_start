package sem2;
import java.util.Scanner;

public class task3 {

    public static boolean validate(final String ip) {
        String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
        return ip.matches(PATTERN);
    }

    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter IP-address:");
        String ip = scan.nextLine();
        
        if (validate(ip)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
