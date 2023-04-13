/*
Task_5
Дан текст: в первой строке записано число строк, далее идут сами строки. Определите, сколько различных слов содержится в этом тексте.

Словом считается последовательность непробельных символов идущих подряд, слова разделены одним или большим числом пробелов или символами конца строки.

Sample Input:
4
She sells sea shells on the sea shore;
The shells that she sells are sea shells I'm sure.
So if she sells sea shells on the sea shore,
I'm sure that the shells are sea shore shells.

Sample Output:
19
*/

import java.util.HashSet;

public class t5 {
    public static void main(String[] args) {
        String[] arr = {
            "She sells sea shells on the sea shore;",
            "The shells that she sells are sea shells I'm sure.",
            "So if she sells sea shells on the sea shore,",
            "I'm sure that the shells are sea shore shells."
        };

        HashSet <String> set = new HashSet<>();

        for (String row : arr) {
            String[] arr1 = row.split(" ");
            for (String word : arr1) {
                // char[] chars = word.toCharArray();
                // String w = "";
                // for (char ch : chars) {
                //     if (Character.isLetter(ch)) {
                //         w += ch;
                //     }
                // }
                // set.add(w);
                set.add(word);
            }
        }

        System.out.println(set);
        System.out.println(set.size());
    }
}