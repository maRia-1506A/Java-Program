public class Recursion {
    int fact(int n) {
        if(n==1) {
            return 1;
        } else {
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
        Recursion obj= new Recursion();
        int result= obj.fact(5);
        System.out.println("Factorial of 5 is: "+result);
        
        int result1= obj.fact(4);
        System.out.println("Factorial of 4 is: "+result1);
    }
}
