package FINAL_PROBLEM_SOLVE_SPRING;

public class Book {
    public String title;

    Book(String title) {
        this.title = title;
    }

    public void read() {
        System.out.println("Reading the book: " + title);
    }

    public void displayDetails() {
        System.out.println("Book title: " + title);
    }
}

class FictionBook extends Book {
    public String genre;

    FictionBook(String title, String genre) {
        super(title);
        this.genre = genre;
    }

    public void read() {
        System.out.println("Getting lost in the world of fiction");
    }

    public void borrow() {
        System.out.println("Borrowing the fiction book: " + title);
    }

    public void returnBook() {
        System.out.println("Returing the fiction book: " + title);
    }
}

class NonFictionBook extends Book {
    public String topic;

    NonFictionBook(String title, String topic) {
        super(title);
        this.topic = topic;
    }

    public void read() {
        System.out.println("Exploring the realm of non-fiction");
    }

    public void borrow() {
        System.out.println("Borrowing the non-fiction book: " + title);
    }

    public void returnBook() {
        System.out.println("Returning the non-fiction book: " + title);
    }
}

class Library {
    public static void main(String[] args) {
        Book myBook = new Book("Java Programming");
        FictionBook mysteryBook = new FictionBook("The Da Vinci Code", "fiction");
        NonFictionBook historyBook = new NonFictionBook("Sapiens: A Brief History of Humankind", "Humankind");

        myBook.read();
        mysteryBook.read();
        mysteryBook.borrow();
        historyBook.read();
        historyBook.returnBook();
    }
}