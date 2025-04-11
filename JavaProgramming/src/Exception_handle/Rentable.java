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