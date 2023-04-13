/*
Task_3

import java.util.List;

public class Task_3 {

    // Дана последовательность чисел. Необходимо вернуть число совпадающих пар в этой последовательности
    // Пример 1:     In: arr = [1, 2]  Out: 0
    // Пример 2:     In: arr = [1, 1, 2]  Out: 1
    // Пример 3:     In: arr = [1, 1, 1, 2, 2]  Out: 4
    public static void main(final String[] args) {

    }
*/

import java.util.HashMap;
import java.util.Map;

public class t3 {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 1, 1, 1, 1, 2, 2, 2};
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int j = map.get(arr[i]);
                map.put(arr[i], j + 1);
            }
            else
                map.put(arr[i], 1);
        }

        int sum = 0;
        for (var item : map.entrySet()) {
            int n = item.getValue();
            sum += n*(n-1)/2;
        }

        System.out.println(sum);
    }
}