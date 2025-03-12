// //call by value
// public class CallValue {
//     void change(int i) { //formal parameter
//         i=20;
//     }

//     public static void main(String[] args) {
//         CallValue obj= new CallValue();
//         int x=10; //premitive data
//         System.out.println("x before call: "+x);

//         obj.change(x); //actual parameter
//         System.out.println("x after call: "+x);
//         //x=10--i=10--i=20
//         //formal value change hbe. original value same e thkbe
//     }
// }

//call by reference
public class CallValue {
    String name;
    void change(CallValue r2) {
        r2.name= "Mahir";
    }

    public static void main(String[] args) {
        CallValue r1= new CallValue();
        r1.name= "Maria";
        System.out.println("Before calling: "+r1.name);

        r1.change(r1);
        System.out.println("After calling: "+r1.name);
    }
    //original value change hoa jbe
}
