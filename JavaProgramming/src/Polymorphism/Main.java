package Polymorphism;

public class Main {
    public static void main(String[] args) {
        //runtime polymorphism
        //done by array
        Shape[] s= new Shape[3];
        s[0]= new Shape();
        s[1]= new Rectangle(10, 20);
        s[2]= new Triangle(10, 20);

        for(int i=0; i<3; i++) {
            System.out.println(s[i].area());
        }       
    }
}
