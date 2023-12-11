package Day04_Concatenation;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        char operator;
        int number1,
                number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);


        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextInt();

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Enter second number");
        number2 = input.nextInt();

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " /" + number2 + " = " + result);
                break;
            default:
                System.out.println("invalid operator!");
                break;


        }

        input.close();


    }
}
