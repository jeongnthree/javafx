package ch05_package_inheritance.mypackage.polymorphism;

public class Football extends Sport {
    private int halves; // 하프 타임
    private int goals; // 골수

    public Football(String name, int entry, int halves, int goals) {
        super(name, entry);
        this.halves = halves;
        this.goals = goals;
    }

    public void display() {
        super.showInfo();
        String message = halves + "개의 하프타임으로 구성이 되며, " + goals + "골이 들어갔습니다!.";
        System.out.println(message);
    }
}
