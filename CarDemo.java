// Car.java - Defines the Car class
class Car {
    // Attributes
    int year;
    String make;
    String model;

    // Constructor
    public Car(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}