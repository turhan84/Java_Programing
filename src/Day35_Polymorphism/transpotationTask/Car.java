package Day35_Polymorphism.transpotationTask;

public abstract class Car extends Transportation{

    public Car(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    public void drive(){
        System.out.println("Driving "+getMake()+" "+getModel());
    }


}
