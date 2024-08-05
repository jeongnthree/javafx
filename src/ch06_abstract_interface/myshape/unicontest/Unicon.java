package ch06_abstract_interface.myshape.unicontest;

public class Unicon extends Animal implements Bird, Horse{
    private String name;
    private String gender;
    private String feed;
    private int initspeed;

    public Unicon(String name, String gender, String feed) {
        this.name = name;
        this.gender = gender;
        if(this.gender == "M"){
            this.initspeed = Bird.speed;
        }else {
            this.initspeed = Horse.speed;
        }
        this.feed = feed;
    }



    @Override
    public void run() {
        String message = "'%s'이(가) 시속 '%d' 의 속도로 달립니다.\n";
        System.out.printf(message, this.name, this.initspeed);

    }
    public void display(){
        this.run();
        this.fly();
        this.eat();
    }

    @Override
    public void fly() {
        String message = "'%s'이(가) 시속 '%d' 의 속도로 날아갑니다.\n";
        System.out.printf(message, this.name, this.initspeed);

    }



    @Override
    public void eat() {
        String message = "'%s'이(가) 사료 '%d' 를 먹습니다.\n";
        System.out.printf(message, this.name, this.initspeed);


    }
}
