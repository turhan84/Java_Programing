package Day06_If_Statements;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String NumberToWord = null;

        if (number == 0) {
            NumberToWord = "Zero";
        } else if (number == 1) {
            NumberToWord = "One";
        } else if (number == 2) {
            NumberToWord = "Two";
        } else if (number == 3) {
            NumberToWord = "Tree";
        } else if (number == 4) {
            NumberToWord = "Four";
        } else if (number == 5) {
            NumberToWord = "Five";
        } else if (number == 6) {
            NumberToWord = "Six";
        } else if (number == 7) {
            NumberToWord = "Seven";
        } else if (number == 8) {
            NumberToWord = "Eight";
        } else if (number == 9) {
            NumberToWord = "Nine";
        }

        System.out.println( number + " is to Word => " + NumberToWord );
    }
}

/*
2. Create a class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
        Ex:
        number = 1;

        output:
        One

        Note: Do not use more than one print statement
*/
