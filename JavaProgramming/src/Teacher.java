public class Teacher { //class
    String name, gender; //variable
    int mobile; 

    //parameterized method
    void setinfromation(String n, String g, int m) { 
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

        Teacher teacher1= new Teacher(); //object(teacher1) declare & create(class Teacher)
        teacher1.setinfromation("Zannatul Farzana",  "Female", 1778326029);
        teacher1.displayinformation();

        Teacher teacher2= new Teacher(); //object(teacher2) declare & create
        teacher2.setinfromation("Maria","Female", 1608233419);
        teacher2.displayinformation();
    }

}
