package sem6;

public class t1 {
    public static void initHashSet(){
        var a = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(a);
    }

    public static void initLinkedHashSet(){
        var b = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(b);
    }
    public static void initTreeSet(){
        var b = new TreeSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(b);
    }

}
