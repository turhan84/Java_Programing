package Day34_Abstraction.animalTask;

public class Duck extends Animal implements Playable, Flyable, Swimmable{
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Duck "+getName()+" is eating worm");
    }

    @Override
    public void play() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
