package Day24_DateAndTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));

        people[1].setInfo("Turhan", 'M', LocalDate.of(1984, 4, 20));

        people[2].setInfo("Nurhan", 'F', LocalDate.of(1987, 11, 2));

        people[3].setInfo("Neslihan", 'F', LocalDate.of(2019, 1, 5));

        people[4].setInfo("Metehan", 'M', LocalDate.of(1960, 10, 14));


        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll( Arrays.asList(people) );

        // print name & date of birth of each person object

        for (Person each : studentsList) {
            System.out.println("Name: "+ each.name + "\t DOB: " + each.dateOfBirth);
        }

        System.out.println("=====================================================");
        // remove all the person object that has the age > 55

        studentsList.removeIf(person -> LocalDate.now().getYear() - person.dateOfBirth.getYear()>55);

        for (Person each : studentsList) {
            System.out.println("Name: "+ each.name + "\t DOB: " + each.dateOfBirth);
        }

    }

}