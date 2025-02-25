public class MethodOverloading {
    void add(int a, int b) {
        System.out.println(a+b);
    }
    void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }
    void add(double a, double b) {
        System.out.println(a+b);
    }
    void add() {
        System.out.println("Nothing to add");
    }  
    
    public static void main(String[] args) {
        MethodOverloading obj= new MethodOverloading();
        obj.add();
        obj.add(5,5);
        obj.add(5,5,5);
        obj.add(10.0, 10.0);
    }
}

