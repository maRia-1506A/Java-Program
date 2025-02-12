public class Increment_decrement {
    public static void main(String[] args) {
        int x=25, y;

        y= --x; //pre decre
        System.out.println("y= "+y); //24
        
        y= x--; //post decre
        System.out.println("y= "+y); //24

        y= ++x; //pre incre
        System.out.println("y= "+y); //24
        
        y= x++; //post incre
        System.out.println("y= "+y); //24
    

    }
    
}
