package sem1;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("cnt: ");
        int cnt = iScanner.nextInt();
        int[] arr = new int[cnt];
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = iScanner.nextInt();
            if (i % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.printf("sum")
        System.out.println(sum);
        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
}
