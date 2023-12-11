package Day16_Nested_Loop;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(CLetters(in.nextLine()));
    }

    public static String CLetters(String str) {
        String result = "";  // "bdf"

        str = str.replace( " ", "");
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character of str
            int count = 0;
            for (int i = 0; i < str.length(); i++) { // responsible for comparing ch to each character of str and return the frequency of ch
                if(str.charAt(i) == ch){
                    count++;
                }
            }

            if(!result.contains(""+ch)){

                result += count+(""+ch);

            }

        }


        return result;

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
