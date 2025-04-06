//Question 3: Build Your Smart Vehicle Fleet
//3. Call the charge() method on electric vehicles using an EcoFriendly reference.(ai part baki)

public interface EcoFriendly {
    public abstract void charge();
}

abstract class Vehicle {
    public String brand, model;
    public int year;

    //constractor
    Vehicle(String brand, String model, int year) {
        this.brand= brand;
        this.model= model;
        this.year= year;
    }

    //method
    public void displayinfo() {
        System.out.println("Brand name: "+brand);
        System.out.println("Model name: "+model);
        System.out.println("Year: "+year);
    }

    //abstract method
    abstract void calculateFuelEfficiency();
}

class Car extends Vehicle {
    public int numberOfDoors;
    public double mpg;

    //constractor
    public Car(String brand, String model, int year, int numberOfDoors, double mpg) {
        super(brand, model, year);
        this.numberOfDoors= numberOfDoors;
        this.mpg= mpg;
    }

    //override
    public void calculateFuelEfficiency() {
        System.out.println("Total fuel: "+mpg+" mpg");
        System.out.println();
    }

    //override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Number of doors: "+numberOfDoors);
    }
}

class Motorcycle extends Vehicle {
    public String type;
    public double mpg;

    //constractor
    public Motorcycle(String brand, String model, int year, String type, double mpg) {
        super(brand, model, year);
        this.type= type;
        this.mpg= mpg;
    }

    //override
    public void calculateFuelEfficiency() {
        System.out.println("Total fuel: "+mpg+" mpg");
        System.out.println();
    }

    //override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Type of bike: "+type);
    }
}

class ElectricCar extends Car implements EcoFriendly{
    public int batteryCapacity;
    public double miles_kwh;

    //constractor
    public ElectricCar(String brand, String model, int year, int numberOfDoors, double mpg, int batteryCapacity, double miles_kwh) {
        super(brand, model, year, numberOfDoors, 0);
        this.batteryCapacity= batteryCapacity;
        this.miles_kwh= miles_kwh;
    }

    //override
    public void calculateFuelEfficiency() {
        System.out.println("Total fuel: "+miles_kwh+" miles per kWh");
        System.out.println();
    }

    //override
    public void charge() {
        System.out.println("The electric car is charged using battery");
    }

    //override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Battery capacity: "+batteryCapacity+" kwh");
    }
}

class ElectricBike extends Motorcycle implements EcoFriendly {
    public int batteryCapacity;
    public double kwh;

    //constractor
    public ElectricBike(String brand, String model, int year, String type, double mpg, int batteryCapacity, double kwh) {
        super(brand, model, year, type, 0);
        this.batteryCapacity= batteryCapacity;
        this.kwh= kwh;
    }

    //override
    public void calculateFuelEfficiency() {
        System.out.println("Total fuel: "+kwh+" miles per kWh");
        System.out.println();
    }

    //override
    public void charge() {
        System.out.println("The bike is charged normally");
    }

    //override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Battery capacity: "+batteryCapacity+" kwh");
    }
}

class Main {
    public static void main(String[] args) {
        Car car= new Car("Toyota", "Corolla", 2022, 4, 20.50);
        Motorcycle mc= new Motorcycle("Suzuki", "R-05", 2021, "Sport", 30.05);
        ElectricCar ec= new ElectricCar("Tesla", "M-06", 2025, 4, 0, 80, 50);
        ElectricBike eb= new ElectricBike("One", "S20", 2025, "Racing", 0, 90, 40.25);

        Vehicle[] vc= {car, mc, ec, eb};
        for(int i=0; i<vc.length; i++) {
            vc[i].displayinfo();
            vc[i].calculateFuelEfficiency();
            System.out.println();
        }
    }
}


