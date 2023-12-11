package Day04_Concatenation;

public class SalaryCalculator {
    public static void main(String[] args) {

        /*
        7. Create a class named Day_04.SalaryCalculator, and declare the following variables:
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
                     Net income is: $79560
         */

        int hourlyRate = 50,
                weeklyHours = 45,
                stateTaxRate = 6,
                federalTaxRate = 26,
                yearweek = 52;

        int salaryBeforeTax,
                stateTax,
                federalTax,
                totalTax,
                salaryAfterTax;

        salaryBeforeTax = hourlyRate * weeklyHours * yearweek;
        federalTax = salaryBeforeTax * federalTaxRate / 100;
        stateTax = salaryBeforeTax * stateTaxRate / 100;
        totalTax = federalTax + stateTax;
        salaryAfterTax = salaryBeforeTax - totalTax;


        System.out.println("Gross pay is:   $" + salaryBeforeTax);
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("State tax is:   $" + stateTax);
        System.out.println("Total tax is:   $" + totalTax);
        System.out.println("Net income is:  $" + salaryAfterTax);

    }
}
