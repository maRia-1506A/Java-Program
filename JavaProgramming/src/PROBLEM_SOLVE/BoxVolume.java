package PROBLEM_SOLVE;

public class BoxVolume {
    public static void main(String[] args) {
        //obj create
        Box box1= new Box(10.0, 10.0, 10.0);
        Box box2= new Box(20.0, 30.0, 10.0);

        //call method
        box1.displayVol();
        box2.displayVol();
        
    }
    
}
