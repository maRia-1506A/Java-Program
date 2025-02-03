public class String2 {
    public static void main(String[] args) {
        String firstName= "Zannatul";
        String lastName= " Maria";

        //adding two string
        String fullName= firstName.concat(lastName);
        System.out.println("Full name: "+fullName);
        
        //upper case
        String upperName= fullName.toUpperCase();
        System.out.println("Upper name: "+upperName);
        
        //lower case
        String lowerName= fullName.toLowerCase();
        System.out.println("Lower name: "+lowerName);
        
        //starts with
        boolean first= firstName.startsWith("Zan");
        System.out.println("true or false: "+first);
        
        //ends with
        boolean last= firstName.endsWith("Zan");
        System.out.println("true or false: "+last);
        
        //string array(for each loop)
        String[] name= {"maria", "afridi", "efath"};
        for(String i: name) {
            System.out.println(i);
        }
    }   
}
