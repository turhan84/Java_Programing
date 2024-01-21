package Day20_For_Each;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "Cydeo School";

        char [] chr = str.replace(" ", "").toCharArray();
        System.out.println(Arrays.toString(chr));
        String r = "";
        char[] ch = new char[str.length()-1];

        for (int i = chr.length - 1, j=0 ; i >= 0; i--, j++) {
            r += chr[i];
            ch[j] = chr[i];
        }
        System.out.println(r);
        System.out.println(Arrays.toString(ch));

        System.out.println("================= split =================");

        String str2 = "Today is a great day to learn java";

        String[] words = str2.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------------------------");

        String sentence = "I Love Java";

       String[] arr = ArraysUtility.reverse(sentence.split(" ")) ;

        System.out.println(Arrays.toString(arr));

String reversedSentence = "";

        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i] + " ";
        }
        System.out.println(reversedSentence);
    }
}
