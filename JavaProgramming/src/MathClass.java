public class MathClass {
    public static void main(String[] args) {
        int x=2, y=-3;

        int max= Math.max(x,y);
        System.out.println("Maximum: " +max);
        
        int min= Math.min(x,y);
        System.out.println("Minimum: " +min);

        int absulate= Math.abs(y);
        System.out.println("Absulate: " +absulate);

        double power= Math.pow(x,y); //double value nei
        System.out.println("x to the power y: " +power);

        int round= Math.round(5.9f);
        System.out.println("Round: " +round);

        double pi= Math.PI;
        System.out.println("Pi: " +pi);
        
        System.out.println("Sqrt of 3: "+Math.sqrt(25));

        System.out.println("Log of 1: "+Math.log(1));
        
        System.out.println("Expotential of 1: "+Math.exp(1));
        
        System.out.println("Ceiling: "+Math.ceil(-5.5));

        System.out.println("Floor: "+Math.floor(5.5));

    }
    
}
