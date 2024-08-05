package ch10_collection;

import java.util.List;

public class BoardMain {
    public static void main(String[] args) {
        Board lee = new Board(10, "여름 폭염", "이재선", "2024/07/08", 5);
        Board sim = new Board(9, "우크라이나 전쟁", "심수련", "2024/03/01", 3);
        Board yoon = new Board(8, "장마", "윤정혁", "2024/08/15", 8);
        BoardDao dao = new BoardDao();
        int cnt = -1 ;
        // 게시물 등록
        cnt = dao.insertData(lee);
        cnt = dao.insertData(sim);
        cnt = dao.insertData(yoon);
        cnt = dao.insertData(new Board(7, "서이 초등학교", "금잔디", "2024/12/25", 4));
        cnt = dao.insertData(new Board(6, "남극 탐험", "이강산", "2024/11/11", 11));

        System.out.println("게시물 건수 : " + dao.getSize());

        System.out.println("\n특정 게시물을 수정합니다.");
        // 10번글 수정하기 : 가을 낙엽, 이형식, 2024/11/11, 100
        // 다음은 수정할 정보입니다.
        lee = new Board(10, "가을 낙엽", "이형식", "2024/11/11", 100);
        cnt = dao.updateData(lee);

        System.out.println("\n모든 게시물을 조회합니다.");
        List<Board> boardList = dao.selectAll();

        final String MAIN_TITLE = "글번호\t제목\t작성자\t작성 일자\t조회수";
        System.out.println(MAIN_TITLE);

        // 실제 웹 프로그램에서는 게시물 목록 보기에 해당합니다.
        // <table> 태그를 사용하여 표 형식으로 보여 줍니다.
        for(Board bean : boardList){
            int no = bean.getNo() ;
            String title = bean.getTitle() ;
            String writer = bean.getWriter();
            String regdata = bean.getRegdate();
            int readhit = bean.getReadhit() ;
            String message = "%d\t%s\t%s\t%s\t%d\n" ;
            System.out.printf(message, no, title, writer, regdata, readhit);
        }

        // 실제 웹 프로그램에서는 게시물 상세 보기 및 게시물 수정시 사용됩니다.
        System.out.println("\n게시물 번호를 이용하여 게시물 정보를 출력합니다.");
        int findId = 7 ; // 찾고자 하는 게시물 글 번호
        Board bean = dao.getOne(findId);
        if(bean == null){
            System.out.println("글번호 " + findId + " 게시물은 존재하지 않습니다.");

        }else{
            System.out.println(MAIN_TITLE);
            String message = "%d\t%s\t%s\t%s\t%d\n" ;
            System.out.printf(message, bean.getNo(), bean.getTitle(), bean.getWriter(), bean.getRegdate(), bean.getReadhit());
        }

        System.out.println("\n게시물 번호를 이용하여 게시물 정보를 삭제합니다.");
        int deleteKey = 8 ; // 삭제할 글 번호

        int result = -1 ; // -1은 삭제 실패시의 값으로 가정
        result = dao.deleteData(deleteKey);

        if(result != -1){
            System.out.println(deleteKey + "번 게시물 삭제 성공");
        }else{
            System.out.println(deleteKey + "번 게시물을 발견하지 못했습니다.");
        }

        System.out.println("게시물 건수 : " + dao.getSize());
        System.out.println("게시물 목록을 모두 지웁니다.");
        dao.deleteAllData();
        System.out.println("after all deleted : " + dao.getSize());
    }
}








