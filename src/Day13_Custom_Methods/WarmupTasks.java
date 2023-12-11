package Day13_Custom_Methods;

import java.util.Scanner;

public class WarmupTasks {
    public static void main(String[] args) {

        calculate(200, 5, '*');

        System.out.println("============================");

        calculate(1,100,'-');

/*        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers and then Math Operator");
        double n1 = input.nextDouble(),
                n2 = input.nextDouble();
        char operator = input.next().charAt(0);

        calculate(n1,n2,operator);
        */
        System.out.println("---------------------------------------------------");

        ageGroup(75);

        System.out.println("---------------------------------------------------");

        eligibleToVote(18, true);
    }





    public static void calculate (double num1, double num2, char mathOperator){
 double result = 0;
   //  double float long boolean
switch (mathOperator){
    case '+':
        System.out.println(num1 + " " + mathOperator + " " + num2 + "=" + (num1 + num2) );
        break;
    case '-':
        System.out.println(num1 + " " + mathOperator + " " + num2 + "=" + (num1 - num2) );
        break;
    case '*':
        System.out.println(num1 + " " + mathOperator + " " + num2 + "=" + (num1 * num2) );
        break;
    case '/':
        System.out.println(num1 + " " + mathOperator + " " + num2 + "=" + (num1 / num2) );
        break;
    default:
        System.out.println("invalid operator" + mathOperator);
}
 }

    private static void ageGroup(int age) {

        if(age >=0  && age <= 150){

            System.out.println(  (age < 21)? "Teenager"  :(age < 55)? "Adult" : "Senior" );

        }else{

            System.err.println("Invalid age: "+age);

        }

    }

    private static void eligibleToVote(int age, boolean isAmerican) {

        if(age >= 18 && isAmerican){
            System.out.println("You are eligible to vote");
        }else{
            System.err.println("You are not eligible to vote");
        }
    }

}

/*
	1. Create a method named calculate that can take three arguments:
            num1 (double)
            num2 (double)
            mathOperator (char)

 	2. Create a method named ageGroup that can print the age group of the person

	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )

	    3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)

	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)

	        output:
	            You are eligible to vote



*/
