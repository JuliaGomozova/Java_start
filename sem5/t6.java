/*
Task_1
Вводится число n. Затем 2*n строк. Каждая пара строк - имя человека и его профессия. 
Определите, сотрудников какой профессии больше всего. 
Выведите на экран это количество, профессию и их имена на экран в том же порядке, в котором они вводились.
Гарантируется, что будет введено не более 100 сотрудников.

Sample Input:
7
Иван
Токарь
Семён
Программист
Анатолий
Кузнец
Вася
Финансист
Кирилл
Программист
Оля
Программист
Валера
Токарь

Sample Output:
3
Программист
Семён
Кирилл
Оля
*/

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;

public class task5_6 {
    public static void main(String[] args) {
        
        String[] arr = {
            "Токарь", "Иван", 
            "Программист", "Семён", 
            "Кузнец", "Анатолий", 
            "Финансист", "Вася", 
            "Программист", "Кирилл",
            "Программист", "Оля",
            "Токарь", "Валера"
        };
        
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0)
                continue;
            if (map.containsKey(arr[i])) {
                int j = map.get(arr[i]);
                map.put(arr[i], j + 1);
            }
            else
                map.put(arr[i], 1);
        }       

        System.out.println(map);
        
        int max = Collections.max(map.values());

        String prof = "";
        for (var item : map.entrySet()) {
            if (item.getValue() == max)
                prof = item.getKey();
        }
        
        System.out.println(prof);

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && arr[i] == prof)
                System.out.println(arr[i + 1]);
        }
    }
}