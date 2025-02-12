public class Stringbuffer {
    public static void main(String[] args) {
        String str= "Zannatul";
        StringBuffer sb= new StringBuffer(str);
        System.out.println(sb);

        //jkno data type value add
        sb.append(" Farzana ");
        sb.append(25);
        System.out.println(sb);

        //string length set
        sb.setLength(10);
        System.out.println(sb);

        //delete
        sb.delete(0, 5);
        System.out.println(sb);

        //reverse
        sb.reverse();
        System.out.println(sb);
    }
}
//same code gula stringbuffer ar jaigai stringbuilder dia krte prb
