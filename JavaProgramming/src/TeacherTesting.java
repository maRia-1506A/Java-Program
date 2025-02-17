public class TeacherTesting {
    public static void main(String[] args) {
        Teacher teacher1= new Teacher(); //object(teacher1) declare & create

        teacher1.name= "Zannatul Farzana";
        teacher1.gender= "Female";
        teacher1.mobile= 1778326029;

        System.out.println("Name: "+teacher1.name);
        System.out.println("Gender: "+teacher1.gender);
        System.out.println("Mobile: "+teacher1.mobile);

        Teacher teacher2= new Teacher(); //object(teacher2) declare & create
        teacher2.name= "Maria";
        teacher2.gender= "Female";
        teacher2.mobile= 1608233419;

        System.out.println("\nName: "+teacher2.name);
        System.out.println("Gender: "+teacher2.gender);
        System.out.println("Mobile: "+teacher2.mobile);
    }

}
