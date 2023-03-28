package sem2;
import java.util.Scanner;

public class task4 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        char ch = 'm';
        String str = "Good morning my dear friend. My fish.";

        int entries = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) entries++;
        }
        System.out.println(entries);
    }
}
