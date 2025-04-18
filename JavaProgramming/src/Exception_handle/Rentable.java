package Exception_handle;

public interface Rentable {
    double calculateRentalCost(); // by default abstract
}

// abstract class
abstract class Vehicle {
    String vehicleName;
    double baseRate;

    // abstract method
    public abstract void displayDetails();
}

// car class
class Car extends Vehicle implements Rentable {
    double rentalDuration;

    // constractor
    public Car(String vehicleName, double baseRate, double rentalDuration) {
        this.vehicleName = vehicleName;
        this.baseRate = baseRate;
        this.rentalDuration = rentalDuration;
    }

    // abstract method override
    public void displayDetails() {
        System.out.println("Vehicle name: " + vehicleName);
        System.out.println("Base rate: $" + baseRate);
        System.out.println("Rental Duration: " + rentalDuration);
    }

    // interface method
    public double calculateRentalCost() throws InvalidRentalDataException {
        if (rentalDuration < 0) {
            throw new InvalidRentalDataException("Rental duration cannot be negative");
        } else {
            return baseRate * rentalDuration;
        }
    }
}

// bike class
class Bike extends Vehicle implements Rentable {
    double rentalDuration;

    // constractor
    public Bike(String vehicleName, double baseRate, double rentalDuration) {
        this.vehicleName = vehicleName;
        this.baseRate = baseRate;
        this.rentalDuration = rentalDuration;
    }

    // abstract method override
    public void displayDetails() {
        System.out.println("Vehicle name: " + vehicleName);
        System.out.println("Base rate: $" + baseRate);
        System.out.println("Rental Duration: " + rentalDuration);
    }

    // interface method
    public double calculateRentalCost() throws InvalidRentalDataException {
        if (rentalDuration < 0) {
            throw new InvalidRentalDataException("Rental duration cannot be negative");
        } else {
            return baseRate * rentalDuration;
        }
    }
}

class Main {
    public static void main(String[] args) {
    try {
    Car car = new Car("Sedan", 10.0, 5.0);
    car.displayDetails();
    System.out.println("Car Rental Cost: $" + car.calculateRentalCost());
    System.out.println();
    Bike bike = new Bike("Mountain Bike", 8.0, 3.0);
    bike.displayDetails();
    System.out.println("Bike Rental Cost: $" + bike.calculateRentalCost());
    System.out.println();
    // Testing invalid data for Car
    System.out.println("Testing with invalid data:");
    Car invalidCar = new Car("Convertible", 12.0, -4.0);
    } catch (InvalidRentalDataException e) {
    System.out.println("Error: " + e.getMessage());
    }
    try {
    // Testing invalid data for Bike
    Bike invalidBike = new Bike("Road Bike", 15.0, -2.0);
    } catch (InvalidRentalDataException e) {
    System.out.println("Error: " + e.getMessage());
    }
    }
    }