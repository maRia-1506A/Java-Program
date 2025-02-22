public class StaticMethod {
    void display1() {
        System.out.println("I am a non static method");
    }
    static void display2() {
        System.out.println("I am a static method");
    }

    public static void main(String[] args) {
        StaticMethod obj= new StaticMethod();
        obj.display1();

        StaticMethod.display2();//static mathod a rjnne direct call dewa jai, obj lgena
    }
}
