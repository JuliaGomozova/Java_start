package sem2;

public class task5 {
    public static void main(String[] args) {
        String text = "34Hi56";
        int digits = 0;
        int letters = 0;
        for (char ch : text.toCharArray()) {
            if (Character.isDigit(ch)) digits++;
            if (Character.isLetter(ch)) letters++;
        }
        if (digits > letters) {
            System.out.println("Digit");
        }
        if (digits < letters) {
            System.out.println("Letter");
        }
        if (digits == letters) {
            System.out.println("Equal");
        }
    }
}
