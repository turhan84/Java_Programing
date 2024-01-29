package day39_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;


public class ListDemo {


    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(); // Array Based Class ===> get() is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);


        arrayList.remove(0);

        arrayList.get(0);

        LinkedList<Integer> linkedList = new LinkedList<>(); // Node based class (Doubly linked List) ===> add(), addAll(), remove(), removeAll(), removeIf(), retainAll() are faster

        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);


        linkedList.remove(0);
        
        linkedList.get(0);


        System.out.println("------------------------------------------------------------");


        Vector<Integer> vector = new Vector<>();

        vector.add(100);
        vector.add(200);
        vector.add(300);

        vector.get(0);


/*
     // Vector oluşturma
        Vector<String> vector1 = new Vector<>();

        // Eleman ekleme
        vector1.add("Java");
        vector1.add("Python");
        vector1.add("C++");

        // Elemanları yazdırma
        for (String language : vector1) {
            System.out.println(language);
        }*/

        System.out.println("------------------------------------------------------------");

        Stack<Integer> stack = new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack);

        int lastElement = stack.pop();

        System.out.println(stack);

        int secondLastElement = stack.pop();

        System.out.println(secondLastElement);

        System.out.println("Benim ====== ");
        Stack<String> stack1 = new Stack<>();

        // Yığına eleman ekleme
        stack1.push("Java");
        stack1.push("Python");
        stack1.push("C++");
        System.out.println(stack1);
        // En üstteki elemanı çıkarma
        String poppedElement = stack1.pop();
        System.out.println("Popped Element: " + poppedElement);

        // En üstteki elemana erişme
        String topElement = stack1.peek();
        System.out.println("Top Element: " + topElement);

        // Yığının boş olup olmadığını kontrol etme
        boolean isEmpty = stack1.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);


    }

}
