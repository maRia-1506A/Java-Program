public class ArrayForEach {
    public static void main(String[] args) {
        String[] color= {"Black", "Blue", "Brown"};
        for(String i: color) {
            System.out.println(i);
        }

        int[] number= {10, 20, 30, 40, 50};
        int sum=0;
        for(int n : number) {
            System.out.println(n);
            sum= sum + n;
        }
        System.out.println("The sum: "+sum);

    }
    
}
