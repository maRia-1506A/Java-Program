package New_pack;

public class Main {
    public static void main(String[] args) {
        Bachelor b1= new Bachelor("Maria", "Bangladesh", 20, 4.00);
        Master m1= new Master("Maria", "Bangladesh", 24, 3.51);

        b1.setEmail("maria363@gmail.com");
        b1.display();
        b1.isEligible();
        
        m1.setEmail("maria363@gmail.com");
        m1.display();
        m1.isEligible();
    }
}
