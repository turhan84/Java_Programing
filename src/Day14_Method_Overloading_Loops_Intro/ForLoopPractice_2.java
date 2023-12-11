package Day14_Method_Overloading_Loops_Intro;

import java.util.Scanner;

public class ForLoopPractice_2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
            sum += input.nextInt();

        }


        System.out.println("sum = " + sum);

        System.out.println("=======================");

        sum = 0;
        int s = 0;
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number");
           // sum += input.nextInt();
            sum = input.nextInt();
            s = sum;
if (s < sum){
   s = s;
}
            s = sum;
        }
        System.out.println("sum = " + s);


        // write a program that can ask the user enter to enter a number for five times,  print the maximum number


        // write a program that can ask the user enter to enter a number for five times,  print the minimum number


    }
}
