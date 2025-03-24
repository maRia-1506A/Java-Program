package Polymorphism;

public class Rectangle extends Shape {
    double length, width;
    
    Rectangle(double length, double width) {
        this. length= length;
        this. width= width;
    }

    double area() {
        System.out.print("Area of rectangle: ");
        return length*width;
    }
} 

/*
 Animal animal;
 animal= new Dog();
 animal.sound();
 */