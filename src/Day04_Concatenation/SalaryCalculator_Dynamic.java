package Day04_Concatenation;

import java.util.Scanner;

public class SalaryCalculator_Dynamic {

    public static void main(String[] args) {

/*        7. Create a class named Day_04.SalaryCalculator, and declare the following variables:
        hourlyRate
                weeklyHours
        stateTaxRate
                federalTaxRate

        7.1 Use the given info above to calculate the followings:
        salaryBeforeTax
                stateTax
        federalTax
                totalTax
        salaryAfterTax

        7.2 Display each of the above in the following format:
        Ex:
        hourlyRate = $50
        weeklyHours = 45
        stateTax = 6  (given as percentage)
        federalTax = 26 (given as percentage)

        output:
        Gross pay is: $117000
        Federal tax is: $30420
        State tax is: $7020
        Total tax is: $37440
        Net income is: $79560*/

/*        int hourlyRate = 50,
                weeklyHours = 45,
                stateTaxRate = 6,
                federalTaxRate = 26,
                yearweek = 52,
                salaryBeforeTax,
                stateTax,
                federalTax,
                totalTax,
                salaryAfterTax;*/


        int salaryBeforeTax,
                stateTax,
                federalTax,
                totalTax,
                salaryAfterTax;
        int YearWeeks = 52;

        Scanner scan = new Scanner(System.in);
        System.out.println("How Much is Hourly Rate by $ :");
        int hourlyRate = scan.nextInt();
        System.out.println("Weekly Hours! :");
        int weeklyHours = scan.nextInt();
        System.out.println("State Tax Rate! :");
        int stateTaxRate = scan.nextInt();
        System.out.println("Federal Tax Rate! :");
        int federalTaxRate = scan.nextInt();


        salaryBeforeTax = hourlyRate * weeklyHours * YearWeeks;
        federalTax = salaryBeforeTax * federalTaxRate / 100;
        stateTax = salaryBeforeTax * stateTaxRate / 100;
        totalTax = federalTax + stateTax;
        salaryAfterTax = salaryBeforeTax - totalTax;
        System.out.println("==========================================");
        System.out.println("Salary Befor Tax : $" + salaryBeforeTax);
        System.out.println("State Tax        : $" + stateTax);
        System.out.println("Federal Tax      : $" + federalTax);
        System.out.println("Total Tax        : $" + totalTax);
        System.out.println("Salary After Tax : $" + salaryAfterTax);
        System.out.println("==========================================");
        System.out.println("----------------------------------------------------------------------");

        System.out.println("Salary Befor Tax : $" + salaryBeforeTax +
        "\nState Tax        : $" + stateTax +
        "\nFederal Tax      : $" + federalTax +
        "\nTotal Tax        : $" + totalTax +
        "\nSalary After Tax : $" + salaryAfterTax);


    }
}
