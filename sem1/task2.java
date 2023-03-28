package sem1;
import java.util.Scanner;
public class task2 {
    Scanner iScanner = new Scanner(System.in);
          System.out.printf("n: ");
          int n = iScanner.nextInt();
          System.out.printf("m: ");
          int m = iScanner.nextInt();
          System.out.printf("k: ");
          int k = iScanner.nextInt();
          
          if (k < n*m && k%n==0 || k%m ==0){
              System.out.println("yes");
          }else{
              System.out.println("no");
          }

    
}
