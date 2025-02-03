public class String3 {
    public static void main(String[] args) {
        String st= "   I am Maria     ";
        System.out.println(st);
        
        //remove the 1st & last space not middle one
        String st1= st.trim();
        System.out.println(st1);

        //find out character
        char ch= st1.charAt(5);
        System.out.println("Character: "+ch);

        //find the ascii value
        int asci= st1.codePointAt(3);
        System.out.println("Ascii value: "+asci);
        
        //find the index
        int pos= st1.indexOf("am");
        System.out.println("Position of 'am' is: "+pos);
        
        //find the last index
        int lastPos= st1.lastIndexOf('a');
        System.out.println("Last position of 'a' is: "+lastPos);

        //replace
        String str= st1.replace('a','u');
        System.out.println("After replacing: "+str);

        //split
        String[] spl= st1.split(" "); //space ar upor depend kre split hbe
        for(String i: spl) {
            System.out.println(i);
        }
    }
}
