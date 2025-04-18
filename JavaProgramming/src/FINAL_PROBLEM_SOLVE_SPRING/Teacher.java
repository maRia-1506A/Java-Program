package FINAL_PROBLEM_SOLVE_SPRING;

public interface Teacher {
    abstract void eating();

    abstract void sleeping();
}

interface Assistant extends Teacher {
    abstract void assisting();
}

interface Studentt {
    abstract void working();
}

class Human implements Assistant, Studentt {
    public void eating() {
        System.out.println("Teacher is eating");
    }

    public void sleeping() {
        System.out.println("Teacher is sleeping");
    }

    public void assisting() {
        System.out.println("Assistantis assisting");
    }

    public void working() {
        System.out.println("Student is working");
    }
}

class RoboHelper {
    public static void main(String[] args) {
        Human human = new Human();
        human.eating();
        human.sleeping();
        human.assisting();
        human.working();
    }
}
