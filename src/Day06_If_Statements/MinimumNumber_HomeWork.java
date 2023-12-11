package Day06_If_Statements;

import java.util.Date;
import java.util.Scanner;

public class MinimumNumber_HomeWork {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Number 1 :");
        int num1 = scan.nextInt();
        System.out.println("Number 2: ");
        int num2 = scan.nextInt();

        if (num1 < num2) {
            System.out.println(num1 + " is the minimum number");
        } else {
            System.out.println(num2 + " is the minimum number");
        }

        // Date
        Date objDate = new Date();
        System.out.println(objDate.toString());

    }
}
/* TASK 3
1. Create a class named MinimumNumber.java
        2. Declare the following variables:
        1. num1
        2. num2
        3. Write a program that can print the minimum number between the
        two numbers above, if both are equal then print Equal
        Ex:
        num1 = 10
        num2 = 20
        output:
        10 is the minimum number
        */
