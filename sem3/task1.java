package sem3;

import java.util.Scanner;
import java.util.ArrayList;


class NumList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        for (int i = 0; i < n; i++) {
            list.add(0);
        }
        list.add(1);
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}