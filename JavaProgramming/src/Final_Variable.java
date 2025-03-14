public class Final_Variable {
    final String UNI_Name="DIU"; //constatnt & next time change hbena
    //blank final variable
    final int fees;
    
    //static blank final variable
    static final int charge;
    
    //blank final variable er jnne constructor lgbe
    Final_Variable() {
        fees= 50000;
    }

    //static blank final variable er jnne static block lgbe
    static{
        charge= 2000;
    }

    void display() {
        System.out.println(UNI_Name);
        System.out.println(fees);
        System.out.println(charge);
    }

    public static void main(String[] args) {
        Final_Variable obj= new Final_Variable();
        obj.display();
    }  
}