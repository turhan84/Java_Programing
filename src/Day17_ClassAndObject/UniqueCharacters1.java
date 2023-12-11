package Day17_ClassAndObject;

public class UniqueCharacters1 {
    public static void main(String[] args) {
 
        String word = "aabcccd";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (word.indexOf(ch)==word.lastIndexOf(ch)){
                result += ch;
            }
        }
        System.out.println("Unique Characters : " + result);
    }
}
/*
	1. Write a program that can find the unique characters from a String
            Ex:
            str = "aabcccd"

            output:
            bd
*/
