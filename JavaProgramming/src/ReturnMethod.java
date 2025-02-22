public class ReturnMethod {
    int square(int a) {
        return a*a;
    }
    
    double circle(double r) {
        return 3.14*r*r;
    }

    public static void main(String[] args) {
        ReturnMethod value1= new ReturnMethod();
        System.out.println("Square of 5 is: "+value1.square(5)); //method call & return value

        ReturnMethod value2= new ReturnMethod();
        System.out.println("Circle of 7 is: "+value2.circle(7));
    }

}
