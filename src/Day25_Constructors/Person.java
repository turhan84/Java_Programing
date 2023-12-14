package Day25_Constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    public String name;
    public int age;
    public LocalDate dateOfBirth;
    public boolean isMarried, isEmployed;

    public Person(String name, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
    }



    public String toString() {

        return "Person" +
                "\nName = " + name +
                "\nAge = " + age +
                "\nDate Of Birth = " + dateOfBirth.format(DateTimeFormatter.ofPattern("MM/dd/y")) +
                "\nIs Married = " + isMarried +
                "\nIs Employed = " + isEmployed ;
    }


    public String eat(String food){
        return "Mark eat " + food;
    }

    public String drink(String drink){
        return "Mark eat " + drink;
    }

    public void sleeping(){
        System.out.println( name + " is sleepig ");
    }

}
/*
name, age, gender, dateOfBirth, isMarried, isEmployed

Add a constructor that can set all the fields once an object is created

toString(), eat(String food), sleeping(), drink(String drink)
 */