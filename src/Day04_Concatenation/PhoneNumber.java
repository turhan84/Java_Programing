package Day04_Concatenation;

import java.util.Scanner;

public class PhoneNumber {

    public static void main(String[] args) {

/*        1. create a class named PhoneNumber and declare the following variables:
        countryCode, areaCode, localNumber

        use string concatenation to display the phone number

        ex:
        if  countryCode = 1
        areaCode = 703
        localNumber = 4512625

        output:
        +1(703)-4512625
        */

        int     areaCode = 703,
                localNumber = 4512625;

        String plus = "+",
                bracket_1 = "(",
                bracket_2 = ")";
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Write Country Code :");
        int countryCode = scan.nextInt();

        if (countryCode == 1)
        {
            System.out.println(plus + bracket_1 + areaCode + bracket_2 + "-" +localNumber );
        }
        else
        {
            System.out.println("Not Match Country Code");
        }







    }
}
