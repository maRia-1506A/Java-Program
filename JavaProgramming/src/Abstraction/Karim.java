package Abstraction;

public class Karim extends MobileUser {
    void sendMessage() {
        System.out.println("Karim sends messages");
    }

    public static void main(String[] args) {
        MobileUser mu;
        mu= new Rahim();
        mu.call();
        mu.sendMessage();
        
        mu= new Karim();
        mu.sendMessage();
        mu.call();
    }
}
