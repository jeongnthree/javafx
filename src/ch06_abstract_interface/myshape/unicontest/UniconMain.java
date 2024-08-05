package ch06_abstract_interface.myshape.unicontest;

public class UniconMain {
    public static void main(String[] args) {
        Unicon unicon = new Unicon("유니돌", "M", "당근");
        unicon.display();

        System.out.println();
        Unicon unisoon = new Unicon("유니순", "F", "건초");
        unisoon.display();

    }
}
