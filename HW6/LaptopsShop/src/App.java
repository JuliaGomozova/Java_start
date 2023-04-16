import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import Laptop.Laptop;



public class App {
    public static void main(String[] args) throws Exception {
        
        HashSet<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("lenovo1", 8, 512, "Windows10", "black"));
        laptops.add(new Laptop("lenovo2", 16, 512, "Windows10", "black"));
        laptops.add(new Laptop("lenovo3", 32, 1000, "Windows10", "black"));
        laptops.add(new Laptop("lenovo3", 32, 2000, "Windows10", "gray"));
        laptops.add(new Laptop("lenovo3", 32, 2000, "Ubuntu", "black"));
        laptops.add(new Laptop("lenovo2", 16, 1000, "Ubuntu", "gray"));
        laptops.add(new Laptop("apple1", 16, 1000, "Mac OS", "gray"));
        laptops.add(new Laptop("apple1", 16, 1000, "Mac OS", "wight"));
        
        filterLaptops(laptops);
    }
 
    /** Выводит ноутбуки по заданным пользователем характеристикам */
    public static HashSet<Laptop> filterLaptops(HashSet<Laptop> laptops) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> charcteristics =  new HashMap<>(); 

        System.out.println("Введите критерий выбора:");
        System.out.println("Model:");
        charcteristics.put("model", sc.nextLine());
        System.out.println("ram:");
        charcteristics.put("ram", sc.nextLine());
        System.out.println("HD:");
        charcteristics.put("hd", sc.nextLine());
        System.out.println("OS:");
        charcteristics.put("os", sc.nextLine());
        System.out.println("Color:");
        charcteristics.put("color", sc.nextLine());
        sc.close();

        //System.out.println(charcteristics);

        HashSet<Laptop> result = new HashSet<>();
        for (Laptop l : laptops) {
            if(l.getModel().equals(charcteristics.get("model")) && 
              (l.getRam() >= Integer.parseInt(charcteristics.get("ram"))) &&
              (l.getHd() >= Integer.parseInt(charcteristics.get("hd"))) &&
              l.getOs().equals(charcteristics.get("os")) &&
              l.getColor().equals(charcteristics.get("color"))
              ){
                result.add(l);
                System.out.println(l.getInfo());
            }
        }

    return result;
    }
}
