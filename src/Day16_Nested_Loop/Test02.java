package Day16_Nested_Loop;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(Letters(in.next()));
    }

    public static String Letters(String str) {
        String a = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);
            count ++;
            if (!a.contains("" + each)) {

                a += (""+each) + count;
                count = 0;
            }
        }

            return a;


    }
}
/*
### Finish the method called `countLetters()` that will take a `String` argument `str` and returns a `String`. Find the frequency of each character in `str` and concatenate the frequency number with the character. Return the concatenated String with all the frequencies. The `countLetters()` method is already called in the main method with an argument.

        #### This is a `return` method with a `String` parameter

        Concatenated String should be in this format:
        > frequency number + letter

        Main topics: methods, Scanner, String, loops

        Example:
        ```
        countLetters("aaabbcccc");

        output:
        3a2b4c
        ```
        Example:
        ```
        countLetters("appleeess");

        output:
        1a2p1l3e2s
        ```
*/
