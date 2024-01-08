package day36_polymorphism;

import Day29_Inheritance.AnimalTask.Animal;
import Day29_Inheritance.AnimalTask.Dog;
import Day30_Inheritance.PhoneTask.Nokia;
import Day30_Inheritance.PhoneTask.Phone;
import Day33_Abstraction.employeeTask.*;
import Day35_Polymorphism.transpotationTask.AutoPilot;
import Day35_Polymorphism.transpotationTask.Electric;
import Day35_Polymorphism.transpotationTask.Tesla;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Dog dog = new Dog();

        // Cat cat = new Dog();

        Animal animal = (Animal) new Dog(); // implicit casting

        System.out.println("-----------------------------------------------------");

        Animal animal1 = new Dog(); //upcasting ==> Polymorphism
        animal1.setInfo("Max", "Husky", 'M', 4, "Large", "White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();

        ((Dog) animal1).bark();  // down casting

        //  Dog dog1 = (Dog)animal1; // down casting
        //   dog1.bark();

        //  ( (Cat)animal1).scratch(); // Dog can not be converted to Cat, because there is not "IS A" relationship between dog and cat


        System.out.println("-------------------------------------------------------------");

        Phone phone = new Nokia("XR20", "Small", "Blue", 350);

        phone.call(911);
        phone.text(123456);
        ((Nokia) phone).selfDefense();

        //    ( (IPhone)phone ).faceTime(123456); // Nokia can not be converted to Iphone, because there is not "IS A" relationship between Nokia and Iphone

        ((Nokia) phone).selfDefense();


        System.out.println("-------------------------------------------------------------");

        Employee employee = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        employee.work();

        System.out.println(((Developer) employee).getProgrammingLanguage());


        //    Driver driver = (Driver) employee;


        System.out.println("-------------------------------------------------------------");

        Electric electric = new Tesla("Tesla", "Model Y", "Blue", 2020, 55000);

        electric.charge();
        ((Tesla)electric).selfDrive();
        ( (AutoPilot)electric ).selfDrive();


        System.out.println("-------------------------------------------------------------");

        Employee employee1 = new Teacher("James", 45,  'M', "B1", "Math Teacher", 75000);

        Employee employee2 = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Employee employee3 = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Employee employee4 = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);

        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();


    }

}
