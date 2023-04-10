import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class task4 {

//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
public static void main(String[] args) {
    Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
    Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
    // result [6,6,0,1]
    System.out.println(sum(d1, d2));

}
public static List<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
    List<Integer> result = new ArrayList<>();
    int temp = 0;
    int n = d1.size();
    for (int i = 0; i < n; i++){
        int n1 = d1.removeFirst();
        int n2 = d2.removeFirst();
        int sum = n1 + n2;
        if (sum >= 10){
            result.add(sum%10 + temp++);
        }else{
            result.add(sum + temp);
            temp = 0;
        }
    }
    result.add(temp);
    return result;
}
}