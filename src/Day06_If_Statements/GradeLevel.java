package Day06_If_Statements;

import java.lang.ref.Cleaner;
import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        int age = 0;
        while (age < 30) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Age for School!");
            age = scan.nextInt();
            String gradeLevel = " ";

            if ((age >= 1) && (age <= 5)) {
                gradeLevel = "Elementary school";
            } else if ((age >= 6) && (age <= 8)) {
                gradeLevel = "Middle school";
            } else if ((age >= 9) && (age <= 12)) {
                gradeLevel = "High school";
            } else if ((age >= 13) && (age <= 16)) {
                gradeLevel = "College";
            } else if ((age >= 17) && (age <= 18)) {
                gradeLevel = "Grad School";
            } else {
                gradeLevel = "Invalid";
            }
            System.out.println("=========================");
            System.out.println(gradeLevel);
            System.out.println("=========================");
        }

    }
}
/*
1. Create a class named GradeLevel.java
        2. An integer variable named gradeLevel is declared and given, Write
        a program to determine and print which school type someone is in
        Ex:
        gradeLevel = 2
        output:
        Elementary School
        The grade level and types are:
        1 ~ 5: Elementary school
        6 ~ 8: Middle school
        9 ~ 12: High school
        13 ~ 16: College
        17 ~ 18: Grad School
        Assume that the given number is 1 ~ 18
        */
