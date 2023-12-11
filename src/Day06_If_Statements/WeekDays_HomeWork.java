package Day06_If_Statements;

import java.util.Scanner;

public class WeekDays_HomeWork {
    public static void main(String[] args) {
        String day = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Day Number :");
        int dayNum = in.nextInt();
        if     (dayNum == 1) { day = "Monday";}
        else if(dayNum == 2){day = "Tuesday";}
        else if(dayNum == 3){day = "Wednesday";}
        else if(dayNum == 4){day = "Thursday";}
        else if(dayNum == 5){day = "Friday";}
        else if(dayNum == 6){day = "Saturday";}
        else if(dayNum == 7){day = "Sunday";}
        else                {day = "Not Found";}
        System.out.println("Day is : " + day);
    }
}
/* TASK 6
1. Create a class named WeekDays.java
        2. An integer variable named number is declared and given, Write a
        program that can print the name of the day that the number represents
        Ex:
        Given:
        number = 1
        output:
        Monday
        Hint: Assume that a number between 1 ~ 7 is given to the variable
*/

