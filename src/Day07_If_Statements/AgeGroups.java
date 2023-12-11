package Day07_If_Statements;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Age :");
        int age = scan.nextInt();
        String age_txt =" ";
        if(age < 21){
            age_txt = "Teenager";
        }
        if(age >=21 && age<55 ){
            age_txt = "Adult";
        }
        if(age  > 55 && age<=100){
            age_txt = "Senior";
        }
        if ((age<0) || (age > 150)){
            age_txt = "invalid";
        }
        System.out.println(age_txt);
    }
}
/*
3. Create a class called AgeGroups, write a program that can define the age groups of a person
        age groups are:
        Teenager (< 21)
        Adult   (>=21 && <55 )
        Senior  ( > 55 )

        if age is negative or greater than 150, print invalid

        NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT*/
