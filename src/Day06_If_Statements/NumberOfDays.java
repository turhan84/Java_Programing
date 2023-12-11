package Day06_If_Statements;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        String print = "";
        int monthNumber = 0;
        while (monthNumber < 13) {
            Scanner month = new Scanner(System.in);
            System.out.println("Which Month!");
            monthNumber = month.nextInt();

            boolean is31days = monthNumber == 1 ||
                    monthNumber == 3 ||
                    monthNumber == 5 ||
                    monthNumber == 7 ||
                    monthNumber == 8 ||
                    monthNumber == 10 ||
                    monthNumber == 12;
            boolean is30days = monthNumber == 4 ||
                    monthNumber == 6 ||
                    monthNumber == 9 ||
                    monthNumber == 11;

            boolean is28days = !is30days && !is31days;
            if ((monthNumber >= 1) && (monthNumber <= 12)) {
                if (is31days) {
                    print = monthNumber + ". Month is 31 days";
                } else if (is30days) {
                    print = monthNumber + ". Month is 30 days";
                } else if (is28days) {
                    print = monthNumber + ". Month is 28 days";
                }
                System.out.println("=================================");
                System.out.println(print);
                System.out.println("=================================");
            } else {
                System.out.println("=================================");
                System.out.println(monthNumber + " is Invalid Month Number");
                System.out.println("=================================");
            }
        }
    }

}
/*
1. Create a class named NumberOfDays.java
        2. An integer variable named month is declared and given, Write a
        program that can print the number of days in the given month
        Ex:
        Given:
        number = 1
        output:
        31 days
        Hints:
        Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
        Months that has 30 days are: 4, 6, 9, 11
        Month that has 28 days: 2
        */
