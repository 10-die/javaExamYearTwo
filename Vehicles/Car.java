package javaExamYearTwo.Vehicles;

public class Car extends Vehicle
{

    private String engineSize;

    public Car(String make, String model) 
    {
        super(make, model);
    }

    public Car(String make, String model, String engineSize) 
    {
        super(make, model);
        this.engineSize = engineSize;
    }

    public void printVehicle(String engineSize)
    {
        System.out.println("make: " + super.make + "\nmodel: " + super.model + "\nengine size: " + engineSize);
    }

    @Override
    public void printVehicle()
    {
        System.out.println("make: " + super.make + "\nmodel: " + super.model + "\nengine size: " + engineSize);
    }
}
