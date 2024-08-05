package ch10_collection;

import java.util.List;

public class MemberMain {
    public static void main(String[] args) {
        MemberDao dao = new MemberDao();
        dao.insertData(new Member("kim", "김만수", 10, "남자"));
        dao.insertData(new Member("park", "박영희", 20, "여자"));
        dao.insertData(new Member("lee", "이수영", 30, "여자"));
        dao.insertData(new Member("choi", "최윤식", 40, "남자"));

        int size = dao.getSize();
        System.out.println("요소 개수 : " + size);

        // 회원 정보 수정하기
        Member updated = new Member("lee", "이민철", 50, "남자");
        int cnt = - 1 ;
        cnt = dao.updateData(updated);

        System.out.println("\n모든 회원 정보를 출력합니다.");
        List<Member> memberList = dao.selectAll();
        for(Member bean:memberList){
            String id = bean.getId() ;
            String name = bean.getName() ;
            int age = bean.getAge() ;
            String gender = bean.getGender() ;
            String message = "아이디 : %s, 이름 : %s, 나이 : %d, 성별 : %s\n" ;
            System.out.printf(message, id, name, age, gender);
        }

        System.out.println("\n아이디를 이용하여 회원 정보를 출력합니다.");
        String findId = "park" ;
        Member searchedData = dao.getOne(findId) ;
        if(searchedData == null){
            System.out.println(findId + " 아이디는 존재하지 않습니다.");
        }else{
            String result = "아이디 : %s, 이름 : %s, 나이 : %d, 성별 : %s\n" ;
            System.out.printf(result,
                    searchedData.getId(),
                    searchedData.getName(),
                    searchedData.getAge(),
                    searchedData.getGender());
        }

        System.out.println("\n특정 아이디를 이용하여 회원 정보를 삭제합니다.");
        String deleteId = "choi" ;
        int result = dao.deleteData(deleteId) ;
        if(result != -1){
            System.out.println(deleteId + " 아이디 삭제 성공");
        }else{
            System.out.println(deleteId + " 아이디를 발견하지 못했습니다.");
        }

        System.out.println("\nbefore all deleted : " + dao.getSize());
        System.out.println("회원 목록을 전부 삭제합니다.");
        dao.deleteAllData();
        System.out.println("after all deleted : " + dao.getSize());
    }
}
