package ch06_abstract_interface.myshape.movieExam;

public class MovieAddInfo {
    protected double getRating;
    private String genre ;//장르
    private double rating ;//평점

    public MovieAddInfo(String genre, double rating) {
        this.genre = genre;
        this.rating = rating;
    }

    protected void showData() {
        String message = "장르 : '%s', 평점 : '%.3f'\n";
        System.out.printf(message, this.genre, this.rating);
    }

    protected void getInfo() {
        System.out.println("장르:"+this.genre);
        System.out.println("평점:"+this.rating);
    }
}
