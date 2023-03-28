// Task_1.
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.

// Sample Input:

// 8
// 11
// Sample Output:

// 512
// 1331
package HW1;
import java.util.Scanner;

public class task1 {
    
    public static int cubed(int n){
        int[] arr = new int[1000];
        for(int i = 1; i < 1000; i++){
            arr[i] = i*i*i;
        }
    return arr[n];
    }
  
    public static void main(String[] args) {
      
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число:");
        int num1 = iScanner.nextInt();
        System.out.printf("Введите второе число:");
        int num2 = iScanner.nextInt();

        System.out.printf("Куб первого числа:");
        System.out.println(cubed(num1));
        System.out.printf("Куб второго числа:");
        System.out.println(cubed(num2));
    
    }
}