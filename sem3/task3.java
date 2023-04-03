package sem3;

import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.List;


public class SortList {

    // Дан список с десятью случайными числами, нужно отсортировать
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        sortByCollections(list);
        sortByComparator(list);
    }

    public static List<Integer> sortByCollections(List<Integer> list){
        Collections.sort(list);
        System.out.println(list);
        return new ArrayList<>();
    }

    public static List<Integer> sortByComparator(List<Integer> list){
        Collections.reverse(list);
        System.out.println(list);
        return new ArrayList<>();
    }

}