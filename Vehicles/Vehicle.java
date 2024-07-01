package javaExamYearTwo.Vehicles;

public class Vehicle 
{
    protected String make = "";
    protected String model = "";

    public Vehicle(String make, String model)
    {
        this.make = make;
        this.model = model;
    }

    public void printVehicle()
    {
        System.out.println("Vehicle type: Car");
    }
}
