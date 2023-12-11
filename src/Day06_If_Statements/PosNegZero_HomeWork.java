package Day06_If_Statements;

import java.util.Scanner;

public class PosNegZero_HomeWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give Number :");
        int number = scan.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");

        } else if (number == 0) {
            System.out.println("Zero");

        }
    }
}
/* TASK 4
1. Create a class named PosNegZero.java
        2. An integer variable named number is declared and given, Write a
        program can identify if the number is positive, negative or zero
        Ex:
        number = 20
        output:
        Positive
        */
