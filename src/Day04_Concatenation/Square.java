package Day04_Concatenation;

public class Square {
    public static void main(String[] args) {
        /*

        5. Create a class named Day_04.Square and declare the following variables:
                side
                area
                perimeter

    5.1 Write a program that can calculate the area and perimeter of a square with any given  side
        Ex:
              side = 5

        output:
               Area of the square is 25
               Perimeter of the square is 20
         */


        int side = 5;
        int area = side * side,
                perimeter = side * 4;

        System.out.println("Area of the square is " + area);
        System.out.println("Perimeter of the square is " + perimeter);
    }
}
