import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class task5 {

//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false


    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите строку со скобками:");
        String str = iScanner.next(); 
        System.out.println(validate(str)) ;
    }

    public static boolean validate(String str){
        //System.out.println(str);
        ArrayDeque<Character> deque = new ArrayDeque<Character>();
        Character ch = null;
        for (int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)) {
                case '[': deque.addLast('[');
                          break;
                case '{': deque.addLast('{');
                          break;
                case '(': deque.addLast('(');
                          break;
                case ']': ch = deque.pollLast();
                          if (ch != '[') return false;
                          break;
                case '}': ch = deque.pollLast();
                          if (ch != '{') return false;
                          break;
                case ')': ch = deque.pollLast();
                          if (ch != '(') return false;
                          break;
                default:  break;
            }       
        }
        if (deque.size() == 0) return true;
        else return false;
    }
}