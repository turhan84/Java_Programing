package Day11_String;

import java.util.SortedMap;

public class StringMethods1 {
    public static void main(String[] args) {

        String str = "TURHAN";

        str = str.toLowerCase();

        System.out.println(str);
//--------------------------------------------
        str = str.toUpperCase();

        System.out.println(str);
//================================================

        String word = "Turhan Ismailov";

        word = word.toUpperCase();

        System.out.println(word);

//----------------------------------
        word = word.toLowerCase();

        System.out.println(word);


        //================================================

        String str4 = "                 Cydeo School";

        str4 = str4.trim();

        System.out.println(str4);
//====================================================

        String sentence1 = "Today is Monday, and we have Java Class";

        int index1 = sentence1.indexOf('w');

        System.out.println(index1);

        String s1 = "I Love Java Programming";

        int firstA = s1.indexOf('a');

        System.out.println(firstA);

        int secondA = s1.indexOf("a ");
        System.out.println(secondA);

        //====================================

        String s2 = "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');

        System.out.println(a1);

        int a2 = s2.indexOf("a Python");

        System.out.println(a2);

        int a3 = s2.indexOf("avaS");
        System.out.println(a3);

        int a4 = s2.indexOf("aS");
        System.out.println(a4);


        // -------------------------------------

        String w = "Java";

        System.out.println(w.indexOf('a')); //1

        System.out.println(w.lastIndexOf('a'));//3

        String w2 = "Java Python JavaScript Cydeo Python";

        System.out.println(w2.lastIndexOf('a')); //15

        System.out.println(w2.lastIndexOf('P')); //29





    }
}
