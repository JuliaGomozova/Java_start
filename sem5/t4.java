public class Task_4 {

    // Вам дан массив путей, где пути[i] = [”Город А”, “Город Б”] означают, что существует прямой путь, идущий от
    // ”Город А” до“Город Б”. Верните город назначения, то есть город без какого-либо пути, ведущего в другой город.
    // Пример 1: Input: s = [["Москва","Самара"], ["Курск","Пенза"],["Самара","Курск"]]  Output: Пенза
    // Пример 2: Input: s = [["Москва","Самара"]]  Output: Самара
}
*/

import java.util.Map;
import java.util.HashMap;

public class t4 {
    public static void main(String[] args) {
        
        HashMap<String, String> map = new HashMap<>(Map.of(
            "Москва", "Самара", 
            "Самара", "Курск",
            "Курск", "Пенза",
            "Пенза", "Мурманск"
        ));

        String resCity = "";

        for (var item : map.entrySet()) {
            String cityDest = item.getValue();
            if (!map.containsKey(cityDest))
                resCity = cityDest;
        }

        System.out.println(resCity);
    }
}