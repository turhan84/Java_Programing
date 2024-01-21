package utilities;


import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    //============= REVERSE ==============================
    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length]; // {5, 4, 3, 2, 1}

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        return reverse;
    }

    public static double[] reverse(double[] array) {
        double[] reverse = new double[array.length]; // {5, 4, 3, 2, 1}

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        return reverse;
    }

    public static char[] reverse(char[] array) {
        char[] reverse = new char[array.length]; // {5, 4, 3, 2, 1}

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        return reverse;
    }

    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length]; // {5, 4, 3, 2, 1}

        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }

        return reverse;
    }

    public static int[] addElement(int[] array, int element) {
        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }


    public static double[] addElement(double[] array, double element) {
        double[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }


    public static char[] addElement(char[] array, char element) {
        char[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }


    public static String[] addElement(String[] array, String element) {
        String[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }


    //{1,2,3,4},   1
    public static boolean contains(int[] array, int element) {

        for (int each : array) {
            if (each == element) {
                return true;
            }
        }

        return false;
    }


    public static boolean contains(double[] array, double element) {

        for (double each : array) {
            if (each == element) {
                return true;
            }
        }

        return false;
    }


    public static boolean contains(char[] array, char element) {

        for (char each : array) {
            if (each == element) {
                return true;
            }
        }

        return false;
    }


    public static boolean contains(String[] array, String element) {

        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }
        }

        return false;
    }


    /*

    // array = { 10, 20, 30, 40} , 2  ===> {10, 20, 40}


    public static int[] remove(int[] array, int index){

    }



    public static int[] removeDup(int[] array){

    }

*/
    public static int[] remove(int[] array, int index) {

        int[] newArray = new int[array.length - 1];

        if (index >= 0 && index < array.length) {

            for (int i = 0; i < array.length - 1; i++) {
                if (i >= index) {
                    newArray[i] = array[i + 1];
                } else {
                    newArray[i] = array[i];
                }

            }
        }
        return newArray;
    }

    public static int[] removeDup(int[] array) {

        ArrayList<Integer> newArr = new ArrayList<>();


        for (int i = 0; i < array.length; i++) {
            if (!newArr.contains(array[i])) {
                newArr.add(array[i]);
            }
        }
        int[] arr = new int[newArr.size()];

        for (int i = 0; i < newArr.size(); i++) {
            arr[i] = newArr.get(i);
        }

        return arr;
    }

}