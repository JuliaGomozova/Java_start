package sem1;
import java.util.Scanner;

public class task1 {

//    Task_1
//    Улитка ползёт по вертикальному шесту высотой h метров,
//    поднимаясь за день на a метров, а за ночь спускаясь на b метров.
//    На какой день улитка доползёт до вершины шеста?
//    Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.
//    Программа должна вывести одно натуральное число.
//    Sample Input 1:
//            10
//            3
//            2
//    Sample Output 1:
//            8

    public static void main(String[] args) {
	// write your code here
        Scanner iScanner = new Scanner(System.in);
        System.out.printf( "h: ");
        int h = iScanner.nextInt();
        System.out.printf("a: ");
        int a = iScanner.nextInt();
        System.out.printf("b: ");
        int b = iScanner.nextInt();
        int day = 0;
        while (h - a > 0){
            h = h - a + b;
            day++;
        }
        day++;
        System.out.printf("day: ");
        System.out.print(day);
    }
}