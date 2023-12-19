package Utilites;

import Day27_AccessModifiers.Data;

import java.util.SortedMap;

public class Test {
    public static void main(String[] args) {

        System.out.println(Data.d);

        System.out.println(Data.e);

        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();
        System.out.println("===========================================");


    }
}
