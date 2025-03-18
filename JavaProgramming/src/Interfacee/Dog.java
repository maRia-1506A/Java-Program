package Interfacee;

public class Dog implements Animal {
    public void eat() {
        System.out.println("Dogs eat meat");
    }

    public static void main(String[] args) {
        Animal an;
        an= new Dog();
        an.eat();
    }
    
}
