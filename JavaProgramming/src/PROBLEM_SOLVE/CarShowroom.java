//DISPLAY THE INFO OF 2 CARS
package PROBLEM_SOLVE;

class Car {
    String brand, model;
    Double price;
    int year;

    Car(String brand, String model, Double price, int year) {
        this.brand= brand;
        this.model= model;
        this.price= price;
        this.year= year;
    }

    void display() {
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
        System.out.println("Year: "+year);
        System.out.println();

    }
}

public class CarShowroom {
    public static void main(String[] args) {
        Car car1= new Car("Tayota", "Corolla", 25000.00, 2022);
        Car car2= new Car("Tessla", "Model S", 80000.00, 2023);

        car1.display();
        car2.display();
    }
}
