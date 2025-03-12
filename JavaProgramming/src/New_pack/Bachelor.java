package New_pack;

public class Bachelor extends Student{ 
    public double gpa;

    public Bachelor(String name, String address, int age, double gpa) {
        super(name, address, age);
        this.gpa= gpa;
    }

    public void display() {
        System.out.println("Name: "+name+" Address: "+address+" Age: "+age+" Email: "+getEmail()+" GPA: "+gpa);
    }

    public void isEligible() {
        if(age>=17 && gpa>4.50) {
            System.out.println("Eligible");
            System.out.println();
        } else {
            System.out.println("Not Eligible. Have to take Admission Test");
            System.out.println();
        }
    }   
}
