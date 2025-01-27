public class String1 {
    public static void main(String[] args) {
        String s1= "Zannatul";
        String s2= "Zannatul";
        String s3= "zannatul";
        String s4= "";
        System.out.println("S1: "+s1);
        System.out.println("S2: "+s2);
        System.out.println("Length of S2: "+s2.length()); //length

        if(s1.equals(s2)) { //s1==s2 dewa jbe na karon aita value/length count kore na
            System.out.println("Equals");
        } else {
            System.out.println("not Equals");
        }

        if(s1.equalsIgnoreCase(s3)) { //upper & lower case ignore krbe
            System.out.println("Equals");
        } else {
            System.out.println("not Equals");
        }

        //use of contains
        boolean b1= s1.contains("far"); // s1 ar mddhe "far" ase kina 
        System.out.println(b1);  
        boolean b2= s1.contains("Zan"); // s1 ar mddhe "Zan" ase kina 
        System.out.println(b2);  
        
        // empty kina
        boolean b3= s1.isEmpty(); 
        System.out.println("b3= "+b3); 
        boolean b4= s4.isEmpty(); 
        System.out.println("b4= "+b4);  
    }
}
