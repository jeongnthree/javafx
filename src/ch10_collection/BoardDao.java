package ch10_collection;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    private List<Board> boardList = null ;


    public int updateData(Board bean) {
        int cnt = -1 ;

        // 순서를 유지하고 싶으므로, 일반 for가 좋을 듯 합니다.
        for (int i = 0; i < boardList.size() ; i++) {
            if(bean.getNo() == boardList.get(i).getNo()){ // 수정할 대상 발견
                System.out.println(i + "번째 발견됨");
                boardList.remove(i);
                boardList.add(i, bean);

                // 다음 방법도 좋음
                // boardList.set(i, bean);

                break;
            }
        }

        return cnt ;
    }


    public List<Board> selectAll() {
        return this.boardList ;
    }

    public BoardDao() {
        boardList = new ArrayList<Board>();
    }

    public int insertData(Board bean) {
        System.out.println("게시물 '" + bean.getTitle() + "'이 추가됩니다." );
        boardList.add(bean);
        return 1;
    }

    public int getSize() {
        return this.boardList.size();
    }

    public Board getOne(int findId) {
        // 반복하면서, 글 번호가 findId와 일치하면 발견된 상태
        Board thisBean = null ; // 반환할 변수

        for(Board bean : this.boardList){
            if(findId == bean.getNo()){ // 발견되었으면
                thisBean = bean ;
                break; // 이후 반복문 실행할 필요 없음
            }
        }

        return thisBean;
    }

    public int deleteData(int deleteKey) {
        int cnt = -1 ; // -1은 '발견하지 못함'을 위한 flag 변수
        for(Board bean : this.boardList){
            if(deleteKey == bean.getNo()){ // 발견됨
                this.boardList.remove(bean);
                cnt = 1 ;
                break;
            }
        }
        return cnt ;
    }

    public void deleteAllData() {
        this.boardList.clear();
    }
}