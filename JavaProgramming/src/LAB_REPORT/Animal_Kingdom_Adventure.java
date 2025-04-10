//Question 2: Animal Kingdom Adventure!

class Animal {
    public String name, habitat, diet;

    //constactor
    Animal(String name, String habitat, String diet) {
        this.name= name;
        this.habitat= habitat;
        this.diet= diet;
    }

    //method
    void displayinfo() {
        System.out.println("Name: "+name);
        System.out.println("Habitat: "+habitat);
        System.out.println("Diet: "+diet);
    }
}

class Mammaal extends Animal {
    public String furType;

    //constactor
    Mammaal(String name, String habitat, String diet, String furType) {
        super(name, habitat, diet);
        this.furType= furType;
    }

    //override
    void displayinfo() {
        super.displayinfo();
        System.out.println("Fur type: "+furType);
    }
}

class Bird extends Animal{
    double wingSpan;

    //constactor
    Bird(String name, String habitat, String diet, double wingSpan) {
        super(name, habitat, diet);
        if(wingSpan < 0) {
            System.out.println("Invalid. The wing span cant be negative");
            this.wingSpan= 0;
        } else {
            this.wingSpan= wingSpan;
        }
    }
    //override
    void displayinfo() {
        super.displayinfo();
        System.out.println("Wing span: "+wingSpan);
    }
}

//Multilevel Inheritance
class Dog extends Mammaal {
    String breed;

    //constractor
    Dog(String name, String habitat, String diet, String furType, String breed) {
        super(name, habitat, diet, furType);
        this.breed= breed;
    }
    //override
    void displayinfo() {
        super.displayinfo();
        System.out.println("Breed: "+breed);
    }
}

class Owl extends Bird {
    boolean nightVision;

    //constractor
    Owl(String name, String habitat, String diet, double wingSpan, boolean nightVision) {
        super(name, habitat, diet, wingSpan);
        this.nightVision= nightVision;
    }

    //override
    void displayinfo() {
        super.displayinfo();
        if(nightVision == true) {
            System.out.println("Owl can see in the dark");
        } else {
            System.out.println("Owl can't see in the dark");
        }
    }   
}

//main class
public class Animal_Kingdom_Adventure {
    public static void main(String[] args) {
        Animal a1= new Animal("Creature", "Forest", "Meat");
        a1.displayinfo();
        System.out.println();
        
        Mammaal m1= new Mammaal("Lion", "Jungle", "All meat", "Thick");
        m1.displayinfo();
        System.out.println();
        
        Bird br= new Bird("Owl","Sky", "Mini creature", 3.25);
        br.displayinfo();
        System.out.println();

        Dog dg= new Dog("Kuku", "Home", "Dog food", "Short", "Husky");
        dg.displayinfo();
        System.out.println();

        Owl owl= new Owl("Pecha", "Tree", "Warm", 1.5, true);
        owl.displayinfo();
        System.out.println();
    }
}
