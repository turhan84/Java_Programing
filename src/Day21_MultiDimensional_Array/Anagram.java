package Day21_MultiDimensional_Array;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
//                              SORT
        String str1 = "heart";//"aehtr"
        String str2 = "earth";//"aehtr"


        // Stringi Array a cevirme
   //     String[] a1 = str1.split("");
   //     System.out.println(Arrays.toString(a1));

        char[] a1 = str2.toCharArray();
        System.out.println(Arrays.toString(a1));

        char[] a2 = str2.toCharArray();
        System.out.println(Arrays.toString(a2));

        Arrays.sort(a1);
        Arrays.sort(a2);

       // System.out.println(Arrays.toString(a1));
      //  System.out.println(Arrays.toString(a2));

        boolean isAnagram = Arrays.equals(a1, a2);

        System.out.println("isAnagram = " + isAnagram);
    }
}

/*
	2. Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
            str2 = "earth"

            output:
            true

            str1 = "java"
            str2 = "python"

            output:
            false


            listen  sildent
    */
