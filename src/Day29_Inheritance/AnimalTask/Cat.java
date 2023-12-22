package Day29_Inheritance.AnimalTask;

public class Cat extends Animal { // Cat Is An animal

    public void meow(){
        System.out.println(getName() +" is meowing");
    }

    public void scratch(){
        System.out.println(getName()+" is scratching");
    }

}
