package Day25_Constructors;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {
        Person person1 = new Person("Mark", LocalDate.of(1964,10,21),false,true);

        System.out.println(person1);
        System.out.println();
        person1.sleeping();
        System.out.println();
        System.out.println(person1.eat("Sushi"));
        System.out.println();
        System.out.println(person1.drink("Red Vine"));

    }
}
