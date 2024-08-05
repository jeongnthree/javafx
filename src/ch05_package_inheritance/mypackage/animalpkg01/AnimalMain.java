package ch05_package_inheritance.mypackage.animalpkg01;

public class AnimalMain {
    public static void main(String[] args) {
        Animal01[] animal = {
            new GoldFish01("금붕어", 2, "거실 어항", 10, 2),
            new Lion01("라이언", 15, "세렝게티", 10, 4),
            new Eagle01("독수리", 20, "푸른 창공", 50, 2),
        };

        for (int i = 0; i < animal.length; i++) {
            animal[i].showInfo();

            if(animal[i] instanceof GoldFish01){
                GoldFish01 goldFish = (GoldFish01)animal[i];
                goldFish.swim();

            }else if(animal[i] instanceof Lion01){
                Lion01 lion = (Lion01)animal[i];
                lion.run();

            }else if(animal[i] instanceof Eagle01){
                Eagle01 eagle = (Eagle01)animal[i];
                eagle.fly();
            }else{

            }
        }
    }
}
