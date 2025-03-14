package New_pack;

public class Bachelor extends Student{ 
    public double gpa;

    public Bachelor(String name, String address, int age, double gpa) {
        super(name, address, age);
        this.gpa= gpa;
    }

    public void display() {
        super.display();
        System.out.println("Email: "+getEmail());
        System.out.println("GPA: "+gpa);
    }

    public void isEligible() {
        if(age>=17 && gpa>4.50) {
            System.out.println("You are eligible for Bsc");
            System.out.println();
        } else {
            System.out.println("You are not eligible for Bsc. You have to sit for Admission Test");
            System.out.println();
        }
    }   
}
