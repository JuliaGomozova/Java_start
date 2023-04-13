/*
Task_2

Вводится число n, затем n целых чисел. Для каждого числа выведите слово YES (в отдельной строке), если это число ранее встречалось в последовательности или NO, если не встречалось.

Sample Input:
6
1 2 3 2 3 4

Sample Output:
NO
NO
NO
YES
YES
NO
*/

import java.util.HashSet;
import java.util.Scanner;

public class t2 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        HashSet <Integer> set = new HashSet<>();

        System.out.printf("Введите целое число: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i ++) {
            System.out.print("Введите целое число #"+(i + 1)+": ");
            System.out.println(set.add(sc.nextInt()) ? "No" : "Yes");
        }
    }
}