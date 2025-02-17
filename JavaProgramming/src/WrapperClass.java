public class WrapperClass {
    public static void main(String[] args) {
        //autoboxing(primitive to obj)
        int x=30;
        Integer y=  Integer.valueOf(x);
        System.out.println("y= "+y);

        Integer z= x;//automatically Integer.valueOf()
        System.out.println("z= "+z);

        //unboxing(obj to primitive)
        Double d= new Double(10.25);
        System.out.println("d= "+d);

        double e= d.doubleValue();
        System.out.println("e= "+e);

        double f= d; //automatically d.doubleValue()
        System.out.println("f= "+f);

    }

}
