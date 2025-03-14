package Super;

public class Vehicle {
    String color;
    double weight;

    //constructor
    Vehicle(String color, double weight) {
        this.color= color;
        this.weight= weight;
    }

    //method
    public void display() {
        System.out.println("Color: "+color);
        System.out.println("Weight: "+weight);
    }
}
