package Day09_Scanner;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of Month");
        int numMonth = scan.nextInt();

        String numDays = (numMonth >= 1 && numMonth <= 12) ?
                (numMonth == 1 || numMonth == 3 || numMonth == 5 || numMonth == 7 || numMonth == 8 || numMonth == 10 || numMonth == 12) ? "Months that has 31 days"
                        : (numMonth == 4 || numMonth == 6 || numMonth == 9 || numMonth == 11) ? "Months that has 30 days" : "Months that has 28 days"


                : "Invalid Month Number";
        String numDays2 = "";
        System.out.println(numDays);
        System.out.println("=========================================");

        switch (numMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays2 = "Months that has 31 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays2 = "Months that has 30 days";
                break;
            case 2:
                numDays2 = "Months that has 28 days";
                break;
            default:
                numDays2 = "Invalid Month Number";

        }
        System.out.println(numDays2);

/*
        Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
        Months that has 30 days: 4, 6, 9, 11
*/


    }
}
