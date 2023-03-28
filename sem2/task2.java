package sem2;
import java.util.Scanner;

public class task2 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        //char mLetter = scan.next().charAt(0);
        //char oLetter = scan.next().charAt(0);
        //String text = scan.next();

        char mLetter = 'а';
        char oLetter = 'в';
        String text = "Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
        
        String[] textArr = text.split("\\s");

        int mWords = 0;
        int oWords = 0;
        for (String word : textArr) {
            if (word.indexOf(mLetter) != -1) mWords++;
            if (word.indexOf(oLetter) != -1) oWords++;
        }
        System.out.println(mWords);
        System.out.println(oWords);
    }
}
