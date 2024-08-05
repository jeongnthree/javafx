package ch05_package_inheritance.mypackage.education;

public class PersonMain {
    public static void main(String[] args) {
        String[] subjects = {"java", "database", "python"} ; // 강의 가능한 과목 배열

        Person[] saram = {
                new Student("김철수", 30, "마포 공덕동", "01012345678", MemberType.STUDENT, StudentType.SOPHOMORE, "A"),
                new Staff("홍길동", 50, "금천 가산동", "01055556666", MemberType.STAFF, "총무"),
                new Teacher("박영희", 40, "용산 용문동", "01033334444", MemberType.TEACHER, subjects)
        };



        for (int i = 0; i < saram.length; i++) {
            System.out.println();
            System.out.println(saram[i]);

            if(saram[i] instanceof Student){
                Student student = (Student)saram[i];
                student.learn();
            }else if(saram[i] instanceof Staff){
                Staff staff = (Staff)saram[i];
                staff.work();
            }else if(saram[i] instanceof Teacher){
                Teacher teacher = (Teacher)saram[i];
                teacher.teach();
            }
        }
    }
}
