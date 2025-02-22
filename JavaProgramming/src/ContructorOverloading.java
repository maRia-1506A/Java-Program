public class ContructorOverloading {
    String name, gender;
    int mobile;
    static String university= "DIU";  //static variable

    ContructorOverloading() {
        System.out.println("No information");
        System.out.println();
    }

    ContructorOverloading(String n, String g) {
        name= n;
        gender= g;
    }

    ContructorOverloading(String n, String g, int m) {
        name= n;
        gender= g;
        mobile= m;
    }

    void display() {
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Mobile: "+mobile);
        System.out.println("University: "+university);
        System.out.println();
    }   
    
    public static void main(String[] args) {
        ContructorOverloading cosntructor1= new ContructorOverloading();

        ContructorOverloading cosntructor2= new ContructorOverloading("Maria", "Female");
        cosntructor2.display();

        ContructorOverloading cosntructor3= new ContructorOverloading("Farzana", "Female", 1608233419);
        cosntructor3.display();
    }

}
