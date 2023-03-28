//В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% 
//от предыдущего значения. По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.
//Входные данные
//Программа получает на вход действительные числа x и y
//Выходные данные
//Программа должна вывести одно натуральное число.
//Sample Input:
//10
//20
//Sample Output:
//9



package sem1;
import java.util.Scanner;

public class task3 {
    Scanner iScanner = new Scanner(System.in);
        System.out.printf("x: ");
        double x = iScanner.nextDouble();
        System.out.printf("y: ");
        double y = iScanner.nextDouble();
        int day = 1;

        while (x < y){
            x = x * 1.1;
            day++;
        }
        System.out.println(day);

}
