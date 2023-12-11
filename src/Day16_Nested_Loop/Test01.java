package Day16_Nested_Loop;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.next();
        int[] freq = new int[str.length()];
        int i, j;

        //Converts given string into character array
        char string[] = str.toCharArray();

        for(i = 0; i <str.length(); i++) {
            freq[i] = 1;
            for(j = i+1; j <str.length(); j++) {
                if(string[i] == string[j]) {
                    freq[i]++;

                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
        }

        //Displays the each character and their corresponding frequency
        for(i = 0; i <freq.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                System.out.print(""+ freq[i]+string[i]);
        }
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
