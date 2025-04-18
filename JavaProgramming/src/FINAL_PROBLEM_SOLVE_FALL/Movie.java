package FINAL_PROBLEM_SOLVE_FALL;

public class Movie {
    private String title, director;

    Movie(String title, String director) {
        this.title= title;
        this.director= director;
    }
    Movie() {

    }

    public void setTitle(String title) {
        this.title= title;
    }
    public String getTitle() {
        return title;
    }
    public void setDirector(String director) {
        this.director= director;
    }
    public String getDirector() {
        return director;
    }
}

class Tester {
    public static void main(String[] args) {
        Movie movie= new Movie("Inception", "Christopher Nolan");
        Movie series= new Movie();

        series.setTitle("Interstellar");
        series.setDirector("James Cameron");
        System.out.println(series.getTitle());
        System.out.println(series.getDirector());
        System.out.println(movie.getTitle());
        System.out.println(movie.getDirector());
    }
}

