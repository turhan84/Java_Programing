package Day06_If_Statements;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        int num1,
                num2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Num 1 !");
        num1 = scan.nextInt();
        System.out.println("Num 2 !");
        num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is the maximum number");
        } else {
            System.out.println(num2 + " is the maximum number");
        }
    }
}
