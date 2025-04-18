package FINAL_PROBLEM_SOLVE_SPRING;

import java.util.Scanner;

public class LibrarySystem {
    public int age;

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 12) {
            throw new InvalidAgeException("Error: Age must be at least 12 years old to borrow books");
        } else {
            System.out.println("Age is valid for borrowing");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
    }

}

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
