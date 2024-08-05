package ch06_abstract_interface.myshape.movieExam;

public class Movie extends MovieAddInfo implements MovieDetail{
    private String title ;
    private String director ;
    private int year ;

    public Movie(String title, String director, int year, String genre, double rating) {
        super(genre, rating);

    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void showMovieDetailInfo() {//부가 정보 출력
        this.showMovieInfo();
        super.getInfo();


    }

    @Override
    public void showMovieInfo() {//기본 정보 출력
        System.out.println("영화 제목 ;"+ this.title);
        System.out.println("영화 감독 ;"+ this.director);
        System.out.println("개봉 연도 ;"+ this.year);

    }

    @Override
    public void printData01() {
        String message = "감독이 '%인' 영화 '%'는 평점이 '%.3f'입니다.\n";
        System.out.printf(message, this.director, this.title, super.getRating);
    }


    @Override
    public void printData02() {
        super.showData();
    }
}
