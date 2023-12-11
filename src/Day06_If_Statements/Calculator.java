package Day06_If_Statements;

import java.util.OptionalInt;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class Calculator {
    public static void main(String[] args) {

        char mathOperator;
        int num1,
                num2,
                result = 0;


        Scanner input = new Scanner(System.in);

        System.out.println("Give a Number 1 :");
        num1 = input.nextInt();
        System.out.println("Operators = +, -, *, / ");
        mathOperator = input.next().charAt(0);
        System.out.println("Give a Number 2 :");
        num2 = input.nextInt();

        if (mathOperator == '+') {
            result = num1 + num2;
        } else if (mathOperator == '-') {
            result = num1 - num2;
        } else if (mathOperator == '*') {
            result = num1 * num2;
        } else if (mathOperator == '/') {
            result = num1 / num2;
        }

        if (mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/') {
            System.out.println("" + num1 + mathOperator + num2 + " = " + result);
        } else {
            System.out.println("invalid operator");

        }


    }

}

/*
3. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

        char operator -> -, +, *, /

        when operator is + : add num1, num2
        when operator: - : minus num1, num2
        when operator: * : multiply num1, num2
        when operator: / : divide num1, num2
        for any other operators: print "invalid operator"
*/
