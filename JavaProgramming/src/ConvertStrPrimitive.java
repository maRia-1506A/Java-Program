public class ConvertStrPrimitive {
    public static void main(String[] args) {
        //primitve to string
        double x= 30;
        String str= Double.toString(x);
        System.out.println("s= "+str);

        boolean b= false;
        String str1= Boolean.toString(b);
        System.out.println("s1= "+str1);

        //string to primitive
        String s="40";
        Double d= Double.parseDouble(s);
        System.out.println("d= "+d);
    } 
}
