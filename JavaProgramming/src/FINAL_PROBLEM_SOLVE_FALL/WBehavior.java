package FINAL_PROBLEM_SOLVE_FALL;

public interface WBehavior {
    void attack();
}

interface WType{
    void WeaponType();
}

abstract class Weapon implements WBehavior, WType {
   public abstract void hasWeapon();
}

class Sword extends Weapon {
    public void attack() {
        System.out.println("Swing the sword!");
    } 
    public void WeaponType() {
        System.out.println("WeaponType: Melee");
    }       
    public void hasWeapon() {
        System.out.println("You have a sword!");
    }
}
class Bow extends Weapon {
    public void attack() {
        System.out.println("Shoot an arrow!");
    }  
    public void WeaponType() {
        System.out.println("WeaponType: Ranged");
    }     
    public void hasWeapon() {
        System.out.println("You have a bow");
    }
}

abstract class MeleeFactory {
    public abstract void createMeleeWeapon();
}

abstract class RangedFacotry {
    public abstract void createRangedWeapon();
}

class WeaponFactory extends MeleeFactory {
    public void createMeleeWeapon() {
        System.out.println("Melee weapon is created");
    }
    public void createRangedWeapon() {
        System.out.println("Ranged weapon is created");
    }
}

class Main {
    public static void main(String[] args) {
        Sword sw= new Sword();
        sw.attack();
        sw.WeaponType();
        sw.hasWeapon();
        Bow bow= new Bow();
        bow.attack();;
        bow.WeaponType();
        bow.hasWeapon();
        WeaponFactory wf= new WeaponFactory();
        wf.createMeleeWeapon();
        wf.createRangedWeapon();
    }
}
