package Abstraction;

public abstract class MobileUser {
    //non-abstract method
    public void call() {
        System.out.println("Anyone can messsage");
    }
    abstract void sendMessage() ; //abstract method
}
