package Day22_WrapperClasses_ArrayList_Intro;

import utilities.ArraysUtility;


public class Test {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 90};

        boolean has25 = ArraysUtility.contains(numbers, 25);

        System.out.println("has25 = " + has25);

        System.out.println("--------------------------------------------");

        String[] students = {"Sumeye", "Hamza", "Marika"};

        System.out.println( ArraysUtility.contains(students, "Khashayar")  );



    }

}
