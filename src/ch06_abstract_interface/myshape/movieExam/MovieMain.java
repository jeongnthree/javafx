package ch06_abstract_interface.myshape.movieExam;

public class MovieMain {
    public static void main(String[] args) {
        MovieBasic one = new Movie("인디아나 존스", "제임스 맨골드", 2023, "어드벤쳐", 10.0);
        one.showMovieInfo();
        one.getGenreRating();

        Movie[] movies = {
                new Movie("인셉션","크리스토퍼 놀란", 2010, "액션", 7.67)
        };

        for (int i = 0; i < movies.length; i++) {
            movies[i].showMovieDetailInfo();

        }

    }
}
