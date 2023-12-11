package Day13_Custom_Methods;

public class ReturnMethodsPractice {
    public static void main(String[] args) {

        System.out.println(isOdd(100));

        int num = 200;

        if (isEven(num)) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num);
        }


        System.out.println("-------------------------------------");

        int n1 = 10;
        int n2 = 20;
        System.out.println("MAX");
        System.out.println(max(n1, n2)+ " is maximum");

        System.out.println( "MIN");

        System.out.println(min(n1, n2)+" is minimum");
    }


    public static boolean isOdd(int num) {
        // return (num % 2 != 0)? true : false;
        if (num % 2 != 0) {
            return true;
        }

        return false;
    }


    public static boolean isEven(int num) {
        return !isOdd(num);
        //  return  (num % 2 == 0)? true : false;
    }


    public static int max(int n1, int n2) {
        // return  n1 > n2 ? n1 : n2;

        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }

    }

    public static int min (int n1, int n2) {
        // return  n1 > n2 ? n1 : n2;


        if (n1 < n2) {
            return n1;
        } else {
            return n2;
        }

    }

}

/*
Create a method named isOdd, that can return true if a number is an odd number

Create a method named isEven, that can return true if a number is an even number

Create a method named max, that can return the maximum number between two numbers

Create a method named min, that can return the minimum number between two numbers

 */