//call by value
public class CallValue {
    void change(int i) { //formal data
        i=20;
    }

    public static void main(String[] args) {
        CallValue obj= new CallValue();
        int x=10;
        System.out.println("x before call: "+x);

        obj.change(x);
        System.out.println("x after call: "+x);
    }
}


