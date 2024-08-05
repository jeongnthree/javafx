package ch10_collection;

import java.util.ArrayList;
import java.util.List;

// DAO(Data Access Object)
// 개발자와 데이터 베이스의 가교 역할
// 주로 메소드를 이용하여 통신한다.
public class MemberDao {
    private List<Member> memberList = null ;

    public MemberDao() {
        this.memberList = new ArrayList<Member>();
    }

    public int insertData(Member member) {
        // 컬렉션에 회원 1명을 추가합니다.
        System.out.println("아이디 " + member.getId() + "가 추가됩니다.");
        this.memberList.add(member) ;
        return 1 ;
    }

    public int getSize(){
        // 컬렉션 요소의 개수를 반환해 줍니다.
        return this.memberList.size() ;
    }

    public List<Member> selectAll(){
        // 모든 회원들의 정보를 반환해 줍니다.
        return this.memberList ;
    }

    public Member getOne(String id){
        // 특정 아이디를 이용하여 회원 정보를 반환합니다.
        // id : 찾고자 하는 아이디
        Member thisMem = null ;
        for(Member bean:this.memberList){
            if(id == bean.getId()){ // 발견됨
                thisMem = bean ;
                break;
            }else{ // 그런 사람 없음
                thisMem = null ;
            }
        }
        return thisMem ;
    }

    public int deleteData(String id){
        int cnt = -1 ; // -1의 의미는 failure
        // 특정 아이디를 이용하여 회원 데이터를 삭제합니다.
        // id : 삭제하고자 하는 아이디
        for(Member bean:this.memberList){
            if(id == bean.getId()){ // 발견됨
                this.memberList.remove(bean) ;
                cnt = 1 ;
                break;
            }else{

            }
        }
        return cnt;
    }

    public void deleteAllData(){
        // 모든 회원 목록을 지웁니다.
        this.memberList.clear();
    }

    public int updateData(Member bean) {
        for (int i = 0; i < memberList.size() ; i++) {
            if(bean.getId().equals(memberList.get(i).getId())){
                memberList.set(i, bean);
                break ;
            }
        }

        return 1 ;
    }
}
