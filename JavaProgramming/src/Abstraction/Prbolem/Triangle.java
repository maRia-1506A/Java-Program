package Abstraction.Prbolem;

public class Triangle extends Shape {
    Triangle(double a, double b) {
        super(a, b);
    }

    void area() {
        System.out.println("Triangle area: "+.5*a*b);
    }
    
}
