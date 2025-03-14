package Super;

public class Car extends Vehicle {
    int gear;

    //constructor
    Car(String color, double weight, int gear) {
        super(color, weight);
        this.gear= gear;
    }

    //method
    @Override
    public void display() {
        super.display();
        System.out.println("Gear: "+gear);
    }

    public static void main(String[] args) {
        Car c1= new Car("Black", 500.50, 20);
        c1.display();
    }    
}
