public class Variable {
    String name, gender; //here name, gender, mobile= intance variable
    int mobile; 

    void setinfromation(String n, String g, int m) { //here n, g, m= local vriable
        name= n;
        gender= g;
        mobile= m;
    }

    //method
    void displayinformation() { 
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Mobile: "+mobile);
        System.out.println();
    }

    public static void main(String[] args) {

        Teacher teacher1= new Teacher();
        teacher1.setinfromation("Zannatul Farzana",  "Female", 1778326029);
        teacher1.displayinformation();

        Teacher teacher2= new Teacher(); 
        teacher2.setinfromation("Maria","Female", 1608233419);
        teacher2.displayinformation();
    }

}
