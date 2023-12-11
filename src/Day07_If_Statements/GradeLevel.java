package Day07_If_Statements;

public class GradeLevel {
    public static void main(String[] args) {
        char grade = 'B';

        String result = "";

        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great Job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else{
            result = "Failed";
        }

        System.out.println(result);
    }
}
/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write a program to determine and print which school type someone is in.
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

      Note: Assume that the given number is between 1 ~ 18

 */