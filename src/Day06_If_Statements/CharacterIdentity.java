package Day06_If_Statements;

import java.util.Scanner;

public class CharacterIdentity {

    public static void main(String[] args) {
        char input;

        Scanner scan = new Scanner(System.in);
        System.out.println("Give a Any Charecter");
        input = scan.next().charAt(0);

        boolean isDigit = input >= '0' && input <= '9';
        boolean isLetter = input >= 'A' && input <= 'Z' || input >= 'a' && input <= 'z';
        boolean isSpecialChar = !isDigit && !isLetter;

        if (isDigit) {
            System.out.println(input + " is a Digit");
        } else if (isLetter) {
            System.out.println(input + " is a Letter");
        } else if (isSpecialChar) {
            System.out.println(input + " is a SpecialChar");
        } else  {
            System.out.println(input + " is INVALID");
        }


    }
}

/*4. Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

        Ex:
        ch = '@'
        output:
        Special Character

        ch = '1'
        output:
        digit

        HINT: You may wanna check out the numbers of the chracters on ASCII table*/

