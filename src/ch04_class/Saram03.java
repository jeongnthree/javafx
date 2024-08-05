package ch04_class;

public class Saram03 {
    private String name ;
    private double height ;
    private double weight ;
    private String hobby ;
    private String blood ;

    //반환타입 메소드이름(매개변수목록){...}

    public String getName() {
        //return name + "님";
        return name ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        //return height * 0.9 ;
        return height ;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
