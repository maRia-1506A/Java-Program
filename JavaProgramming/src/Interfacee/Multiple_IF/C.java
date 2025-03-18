package Interfacee.Multiple_IF;

public class C implements A, B {
    public void play() {
        System.out.println("All can play");
    }

    public static void main(String[] args) {
        C c= new C();
        c.play();
    }
}
