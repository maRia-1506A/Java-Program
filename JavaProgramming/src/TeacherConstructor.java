public class TeacherConstructor {
    String name, gender; //variable
    int mobile;

    //default constructor
    TeacherConstructor() {
        System.out.println("No value");
    }

    //parameterized constructor
    TeacherConstructor(String n, String g, int m) { //class name = consturctor name
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

        TeacherConstructor teacher1= new TeacherConstructor("Zannatul Farzana",  "Female", 1778326029);
        teacher1.displayinformation();

        TeacherConstructor teacher2= new TeacherConstructor("Maria","Female", 1608233419);
        teacher2.displayinformation();

        TeacherConstructor teacher3= new TeacherConstructor();
        teacher3.displayinformation();
    }
    
}
