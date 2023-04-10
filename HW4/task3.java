package HW4;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task3 {
// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,2,1));
    System.out.print(checkOn(deque));

}
public static boolean checkOn(Deque<Integer> deque){
    while (deque.size() > 1){
        if (deque.removeFirst() == deque.removeLast()){

        }else {
            return false;
        }
    }
return true;
}
}
