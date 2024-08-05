package ch06_abstract_interface.myshape.sporttest;

public abstract class Sport {
    private String name ; // 종목 이름
    private int entry ; // 엔트리 수
    protected String result ; // 평가 문자열

    public String getName() {
        return name;
    }

    public int getEntry() {
        return entry;
    }
    public Sport(){}

    public Sport(String name, int entry) {
        this.name = name ;
        this.entry = entry ;
    }

    public abstract void display() ;

    // private < default < protected < public
    protected void getInfo() {
        System.out.println("종목 이름 : " + this.name);
        System.out.println("엔트리 : " + this.entry);
    }

    protected void evaluate() {
        System.out.println("평가 : " + this.result);
    }
}
