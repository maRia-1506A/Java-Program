package New_pack;

public class Master extends Student{
    double cgpa;

    public Master(String name, String address, int age, double cgpa) {
        super(name, address, age);
        this.cgpa= cgpa;
    }

    public void display() {
        System.out.println("Name: "+name+" Address: "+address+" Age: "+age+" Email: "+getEmail()+" CGPA: "+cgpa);
    }

    public void isEligible() {
        if(cgpa>3.50) {
            System.out.println("Eligible");
            System.out.println();
        } else {
            System.out.println("Not Eligible");
            System.out.println();
        }
    }
}
