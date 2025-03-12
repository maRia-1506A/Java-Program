package New_pack;

public class Student {
    public String name, address;
    public int age;
    private String email;

    public Student(String name, String address, int age) {
        this.name= name;
        this.address= address;
        this.age= age;
    }

    //setter method
    public void setEmail(String email) {
        this.email= email;
    }
    //getter method
    public String getEmail() {
        return email;
    }    

    public void display() {
        System.out.println(name);
        System.out.println(address);
        System.out.println(age);
        System.out.println(email);
    }
}
