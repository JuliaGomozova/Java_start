/*
Task_1

Вводится число n, затем n целых чисел. 
Определите, сколько различных чисел было введено.

Sample Input:
7
1 1 2 2 2 3 3

Sample Output:
3
*/

import java.util.HashSet;
import java.util.Scanner;

public class t1 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        HashSet <Integer> set = new HashSet<>();

        System.out.printf("Введите целое число: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i ++) {
            System.out.print("Введите целое число #"+(i + 1)+": ");
            set.add(sc.nextInt());
        }
        
        System.out.println("Различных чисел: "+set.size());
    }
}