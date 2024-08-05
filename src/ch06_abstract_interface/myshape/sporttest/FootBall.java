package ch06_abstract_interface.myshape.sporttest;

public class FootBall extends Sport{
    private int goal ;

    public FootBall(String name, int entry, int goal) {
        super(name, entry);
        this.goal = goal ;

        if (goal >= 20) {
            super.result = "excellent" ;
        }else if (goal >= 15) {
            super.result = "very good" ;
        }else if (goal >= 10) {
            super.result = "good" ;
        }else if (goal >= 3) {
            super.result = "not bad" ;
        }else{
            super.result = "poor" ;
        }
    }

    @Override // 구체화(Implementation)
    public void display() {
        super.getInfo() ;
        System.out.println("골수 : " + this.goal);
        super.evaluate();
    }
}
