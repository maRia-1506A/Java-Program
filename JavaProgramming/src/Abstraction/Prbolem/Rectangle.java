package Abstraction.Prbolem;

public class Rectangle extends Shape {
    Rectangle(double a, double b) {
        super(a,b);
    }

    void area() {
        System.out.println("Rectangle area: "+a*b);
    }
}
