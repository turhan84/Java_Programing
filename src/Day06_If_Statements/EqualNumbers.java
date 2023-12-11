package Day06_If_Statements;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        int n1, n2, n3;
        String result = null;
        Scanner in = new Scanner(System.in);

        System.out.println("1. Number :");
        n1 = in.nextInt();
        System.out.println("2. Number :");
        n2 = in.nextInt();
        System.out.println("3. Number :");
        n3 = in.nextInt();

        if (n1 == n2 && n2 == n3 ) {
            result = "All equal";
        } else if (n1 == n2 && n3 != n2 ) {
            result = "Number_1 & Number_2 are equal";
        } else if (n2 == n3 && n1 != n2 ) {
            result = "Number_2 & Number_3 are equal";
        } else if (n3 == n1 && n3 != n2 ) {
            result = "Number_3 & Number_1 are equal";
        } else {
            result = "None of them are equal";
        }
        System.out.println("------------------------------");
        System.out.println(result);
        System.out.println("------------------------------");

    }
}

/*
5. Create a class named EqualNumbers, and write a program that can check the equality of the three given numberrs
        declare 3 numbers n1, n2, n3
        if all are equal ==> print "all equal"
        if only n1 and n2 are equal  =>print  "n1&n2 are equal"
        if only n2 and n3 are equal ==>print "n2&n3 are equal"
        if only n3 and n1 are qual ==>print "n3&n1 are equal"
        if none of them are euqal ==> none of them are equal
*/
