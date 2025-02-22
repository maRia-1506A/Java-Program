public class StaticBlock {
    static int id;
    static String name;
    
    //static block
    static{
        id= 106;
        name= "Maria";
    }

    static void display() {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
    }

    public static void main(String[] args) {
        StaticBlock.display();
    }
    
}
