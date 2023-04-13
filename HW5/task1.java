package HW5;

import java.util.*;
//import java.lang.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;

public class task1 {
    
    public static void main(String[] args) {
        HashMap<String, String> phonebook = new HashMap<>(Map.of(
            "+79159151515", "Иван Иванов", 
            "+79859858585", "Иван Иванов",
            "+79159151516", "Светлана Петрова", 
            "+79859858587", "Кристина Белова",
            "+79159151511", "Анна Крутова", 
            "+79859858582", "Иван Юрин",
            "+78888888888", "Петр Лыков",
            "+79999999999", "Павел Чернов",
            "+72222222222", "Петр Чернышев",
            "+71111111111", "Мария Федорова"

        ));
        ArrayList <String> names = new ArrayList<>(phonebook.values());
        HashMap<String, Integer> namesMap = new HashMap<>();
        String name = "";
        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            //names.set(i, names.get(i).split(" ")[0]);
            name = names.get(i).split(" ")[0];
            if (namesMap.containsKey(name)){
                namesMap.put(name, namesMap.get(name) + 1);
            } else {
                namesMap.put(name, 1);
            }
        }
        
        System.out.println(sortByValue(namesMap));
        
    }

    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
