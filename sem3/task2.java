package sem3;

import java.util.ArrayList;
        import java.util.Scanner;

public class NumList1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(String.valueOf(i));;
        }

        int m = sc.nextInt();
        String s = sc.next();
        list.add(m, s);
        for (String str : list) {
            System.out.print(str + " ");

            sc.close();
        }
    }
}