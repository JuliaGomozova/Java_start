// Task_3.
// Реализовать простой калькулятор (+,-,=,*), только с целыми числами.

package HW1;
import java.util.Scanner;

public class task3 {

    public static void culc(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите пример используя два натуральных числа и операции + - * / ");
        int n1 = iScanner.nextInt();
        String sign = iScanner.next();
        int n2 = iScanner.nextInt();
        int result = switch (sign) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> n1 / n2;
            default -> 0;
        };
        System.out.print("= ");
        System.out.print(result);
      }
    
      public static void main(String[] args) {
        culc();
      }
    
}
