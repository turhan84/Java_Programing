package Day06_If_Statements;

import java.util.Scanner;

public class MonthName_HomeWork {
    public static void main(String[] args) {
        String month = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Month Number :");
        int monthNum = in.nextInt();
        if     (monthNum == 1){month = "January";}
        else if(monthNum == 2){month = "February";}
        else if(monthNum == 3){month = "March";}
        else if(monthNum == 4){month = "April";}
        else if(monthNum == 5){month = "May";}
        else if(monthNum == 6){month = "June";}
        else if(monthNum == 7){month = "July";}
        else if(monthNum == 8){month = "August";}
        else if(monthNum == 9){month = "September";}
        else if(monthNum == 10){month = "October";}
        else if(monthNum == 11){month = "November";}
        else if(monthNum == 12){month = "December";}
        else                  {month = "Not Found";}

        System.out.println("Month is : " + month);
    }
}
/* TASK 7
1. Create a class named MonthName.java
        2. An integer variable named number is declared and given, Write a
        program that can print the name of the month that the number
        represents
        Ex:
        Given:
        number = 10
        output:
        October
        */
