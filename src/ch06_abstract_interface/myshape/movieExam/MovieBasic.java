package ch06_abstract_interface.myshape.movieExam;

public interface MovieBasic {
    void showMovieInfo();
    default void getInfomation(){
        System.out.println("디폴트 메소드 getGenreRating() 메소드 호출됨");
        printData01();
    }

    default void getGenreRating(){
        System.out.println("디폴트 메소드 getGenreRating() 메소드 호출됨");

        printData02();
    }

    void printData01();

    void printData02();

}
