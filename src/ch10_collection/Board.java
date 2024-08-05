package ch10_collection;

// 게시물 객체 1개를 생성하기 위한 클래스입니다.
// 웹 프로그래밍에서는 이것을 Bean 클래스라고 부릅니다.
public class Board {
    private int no ; // 글번호
    private String title ; // 제목
    private String writer ; // 작성자



    // 날짜 형식이지만 문자열로 처리하면 코딩량이 많이 줄어듬
    private String regdate ; // 작성 일자
    private int readhit ; // 조회수

    // getter, setter, toString, 생성자 구현하기
    public Board() {
    }

    public Board(int no, String title, String writer, String regdate, int readhit) {
        this.no = no;
        this.title = title;
        this.writer = writer;
        this.regdate = regdate;
        this.readhit = readhit;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public int getReadhit() {
        return readhit;
    }

    public void setReadhit(int readhit) {
        this.readhit = readhit;
    }

    @Override
    public String toString() {
        return "Board{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", regdate='" + regdate + '\'' +
                ", readhit=" + readhit +
                '}';
    }
}
