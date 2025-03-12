public class VariableLenArgs {
    void multi(int ... numb) { //joto khushi agrs newa jbe
        int result= 1;
        for(int i: numb) {
            result= result * i;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        VariableLenArgs obj= new VariableLenArgs();
        obj.multi(1, 2);
        obj.multi(1, 2, 3);
        obj.multi(1, 2, 3, 4);
    } 
}
