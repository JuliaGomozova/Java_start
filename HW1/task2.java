// Task_2.
// Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все введённые выше числа. Выведите на экран результат умножения построчно.

// Sample Input:

// 4
// 1
// 2
// 3
// 5
// 2
// Sample Output:

// 2
// 4
// 6
// 10


package HW1;
import java.util.Scanner;

public class task2 {
    
    public static int[] multip_nums(){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Cколько чисел хотите ввести?");
        int cnt = iScanner.nextInt();
        System.out.println("Введите " + cnt + " чисел:");
        int[] arr = new int[cnt];
        for(int i = 0; i < cnt; i++){
            System.out.print("");
            arr[i] = iScanner.nextInt();
        }
        System.out.print("На какое число умножить введенные числа?");
        int m = iScanner.nextInt();
        for(int i = 0; i < cnt; i++){
            arr[i] *= m;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = multip_nums();
        System.out.println("Рузультат:");
        for (int item:arr) {
            System.out.println(item);
        }
    }
}
