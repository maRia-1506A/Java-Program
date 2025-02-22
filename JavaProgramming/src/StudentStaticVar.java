public class StudentStaticVar {
    static int count=0;

    StudentStaticVar(){
        count++;
    }
    
    void displayTotal() {
        System.out.println("Total students: "+count);
    }

    public static void main(String[] args) {
        StudentStaticVar s1= new StudentStaticVar();
        //s1.displayTotal();
        StudentStaticVar s2= new StudentStaticVar();
        //s2.displayTotal();
        StudentStaticVar s3= new StudentStaticVar();
        s3.displayTotal();
    }

}
