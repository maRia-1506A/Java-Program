import java.util.Random;

public class RandomNumb {
    public static void main(String[] args) {
        Random numb= new Random();
        int randomNumb= numb.nextInt(10); //0 to 10
        //int randomNumb= numb.nextInt(10) + 1; //1 to 10(lower value mane jaita theke start krte chai oita 1 ar place e boshbe)
        //int randomNumb= numb.nextInt(6) + 5; //5 to 10
        //int randomNumb= numb.nextInt() + 10; //10 to 100
        System.out.println("Random numner: "+randomNumb);
    }
}


// import java.util.Random;

// public class RandomNumb {
//     public static void main(String[] args) {
//         int randomNumb= (int) (Math.random()*10) +1; //1 to 10
//         System.out.println("Random numner: "+randomNumb);
//     }
// }
