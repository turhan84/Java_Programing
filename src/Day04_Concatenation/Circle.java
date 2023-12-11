package Day04_Concatenation;

public class Circle {
    public static void main(String[] args) {

        /*

6. Create a class named Day_04.Circle and declare the following variables:
                radius
                area
                perimeter

    6.1 Write a program that can calculate the area and perimeter of a circle with any given radius
            Ex:
                  radius = 5

            output:
                   Area of the circle is 78.5
                   Perimeter of the circle is 31.4
         */

        int radius = 5;
        double area = radius * radius * 3.14;
       float perimeter;
       perimeter = (float) (radius * (2.0 * 3.14));

        System.out.println("Area of the circle is " + area);
        System.out.println("Perimeter of the circle is " + perimeter);
    }
}
