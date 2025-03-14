package New_pack;

public class Master extends Student{
    double cgpa;

    public Master(String name, String address, int age, double cgpa) {
        super(name, address, age);
        this.cgpa= cgpa;
    }

    public void display() {
        super.display();
        System.out.println("Email: "+getEmail());
        System.out.println("CGPA: "+cgpa);
    }

    public void isEligible() {
        if(cgpa>3.50) {
            System.out.println("You are eligible for Msc");
            System.out.println();
        } else {
            System.out.println("You are not eligible for Msc");
            System.out.println();
        }
    }
}
