package ch05_package_inheritance.mypackage.polymorphism;

public class Sport {
    private String name; // 종목 이름
    private int entry; // 선수 명수

    public Sport() {
    }

    public Sport(String name, int entry) {
        this.name = name ;
        this.entry = entry ;
    }

    protected void showInfo() {
        String message = name + " 경기는 " + entry + "명의 엔트리로 구성이 됩니다." ;
        System.out.println(message);
    }
}
