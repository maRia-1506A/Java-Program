public class UpCasting {
    void display() {
        System.out.println("Parent class");
    }
}

class NormalClass extends UpCasting {
    void display() {
        System.out.println("Child class");
    }
}

class Test {
    public static void main(String[] args) {
        UpCasting up= new NormalClass(); //upcasting
        up.display();        
    }
}
