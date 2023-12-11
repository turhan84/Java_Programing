package Day06_If_Statements;

import java.util.Scanner;

public class Cigarettes {
    public static void main(String[] args) {
        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Age!");
        age = scan.nextInt();

        if (age >= 20 && age <= 100){
            System.out.println("You are eligible to buy Cigarettes");
        }else {
            System.out.println("You are not eligible to buy Cigarettes");
        }

    }
}
/*
1. Create a class named Cigarettes.java
        2. A variable named age is declared and given, Write a program that
        can check if the person is eligible to buy cigarettes
        Ex:
        age = 20
        output:
        You are not eligible to buy Cigarettes


*/

