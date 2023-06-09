package Java_start.HW2;
import java.util.Scanner;

// На первой строке записывается натуральное число n - количество строчек в книге. Затем вводится n строк - строки книги. 
// потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. 
// Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и 
// продукт2 - продукт, на который следует заменить продукт1. 
// Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. 
// Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

// Выходные данные
// Замените все продукты в поваренной книге Васи и выведите их построчно на экран. На окончания не обращайте внимание. 
// ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!

// Sample Input:
// 2
// Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
// Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
// 3
// арахис - колбаса
// клубника - вишня
// сгущенка - молоко

// Sample Output:
// Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
// Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, "Cp866");
        System.out.println("enter n:");
        int n = scan.nextInt();
        scan.nextLine();
        String book = "";
        for(int i = 0; i < n; i++){
            System.out.println("enter n strings:");
            book +=  scan.nextLine() + " ";
        }

        book = book.toLowerCase();

        System.out.println("enter m:");
        //количество аллергенов
        int m = scan.nextInt();
        scan.nextLine();
        // массив, в котором будет храниться разбитая сплитом введенная строка "аллерген - замена"
        // первый элемент в этом массиве будет аллерген, второй тире, третий продукт замена 
        String[] words = new String[3];
        for(int i = 0; i < m; i++){
            System.out.println("enter m strings:");
            words = scan.nextLine().split(" ");
            book = book.replaceAll(words[0], words[2]); //заменяем в рецепте слова, соответствующие аллергену на замену
        }
        // Переводим в верхний регистр те буквы в тексте, которые должны быть заглавными.
        book = Character.toUpperCase(book.charAt(0)) + book.substring(1); // Перевод в верхн регистр первой буквы текста 
        for(int i = 1; i < book.length() - 1; i++){
            if((book.charAt(i) == '.') && ((i + 3) < book.length())){ //находим точку в тексте, без учета последней точки
                book = book.substring(0,i+2) + Character.toUpperCase(book.charAt(i+2)) + book.substring(i+3); // перевод в верхн регистр символа после точки и  после пробела (i+2) 
            }
        } 
        System.out.println(book);
    }
}
