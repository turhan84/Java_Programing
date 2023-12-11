package Day06_If_Statements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c = 20;

        boolean a_is_Median = (a > b && a < c) || (a > c && a < b);

        boolean b_is_Median = (b > c && b < a) || (b > a && b < c);

        boolean c_is_Median = !a_is_Median && !b_is_Median;

        if (a_is_Median) {
            System.out.println("a is the median number " + a_is_Median);
        } else if (b_is_Median) {
            System.out.println("b is the median number " + b_is_Median);
        } else if (c_is_Median) {
            System.out.println("c is the median number " + c_is_Median);
        }


    }
}

/*
1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

        Ex:
        a = 10, b= 15, c = 20;

        Output:
        15 is the median number#
*/