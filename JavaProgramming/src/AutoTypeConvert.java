public class AutoTypeConvert {
    void add(int a, int b) {
        System.out.println(a+b);
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
        obj.add(5,5,5); //auto
        obj.add(10.0, 10.0);
    }

}
