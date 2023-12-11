package Day06_If_Statements;

import java.util.Objects;
import java.util.Scanner;

public class NetIncomeCalc {
    public static void main(String[] args) {

        int tax = 0,
                after_tax = 0;
        int tax_rate_35 = 35,
                tax_rate_30 = 30,
                tax_rate_25 = 25,
                tax_rate_20 = 20,
                married_tax = 5,
                tax_rate = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Salary");
        int salary = scan.nextInt();
/*        System.out.println("Tax");
        int tax = scan.nextInt();*/
        System.out.println("Married");
        String married = scan.next();


        if ((salary >= 130000)) {

            if (Objects.equals(married, "yes") || Objects.equals(married, "YES")  || Objects.equals(married, "Yes")) {
            tax_rate = tax_rate_35 - married_tax;
            tax = salary * tax_rate / 100;
            married = "YES";
        } else {
            tax_rate = tax_rate_35;
            tax = salary * tax_rate / 100;
            married = "NO";
        }
        }
        else if ((salary >= 100_000 && salary <= 129_000))
        {
            if (Objects.equals(married, "yes") || Objects.equals(married, "YES")  || Objects.equals(married, "Yes"))  {
                tax_rate = tax_rate_30 - married_tax;
                tax = salary * tax_rate / 100;
                married = "YES";
            } else {
                tax_rate = tax_rate_30;
                tax = salary * tax_rate / 100;
                married = "NO";
            }
        }
        else if ((salary >= 80_000 && salary <= 99_000))
        {
            if (Objects.equals(married, "yes") || Objects.equals(married, "YES")  || Objects.equals(married, "Yes")) {
                tax_rate = tax_rate_25 - married_tax;
                tax = salary * tax_rate / 100;
                married = "YES";
            } else {
                tax_rate = tax_rate_25;
                tax = salary * tax_rate / 100;
                married = "NO";
            }
        }
        else if ((salary <= 79_000))
        {
            if (Objects.equals(married, "yes") ){
            tax_rate = tax_rate_20 - married_tax;
            tax = salary * tax_rate / 100;
            married = "YES";
        } else {
            tax_rate = tax_rate_20;
            tax = salary * tax_rate / 100;
            married = "NO";
        }
        }

        after_tax = salary - tax;
        System.out.println("--------------------------------------");
        System.out.println("Salary            : $" + salary);
        System.out.println("Married           : " + married);
        System.out.println("Tax Rate          : %" + tax_rate);
        System.out.println("Salary After TAX  : $" + after_tax);
        System.out.println("--------------------------------------");

    }
}
/*
6. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
        the tax rates are:
        35% for salary of 130K or more
        30% for salary of 100K to 129k
        25% for salary of 80K to 99K
        20% for salary of 79K or less

        in addition, if the person is married, he/she will pay 5% less tax

*/
