package BaiChoMeo;

import java.util.Arrays;

public class ThucHanh {
    public static void main(String[] args) {
        Dog thuy = new Dog(); //khai bao o nho
        thuy.name = "Thuy meo meo";
        thuy.eat();
        thuy.sleep();
        System.out.println(thuy.sound());
        thuy.tiaLong();

        Dog dang = new Dog();
        dang.name = "Dang beo";
        dang.tiaLong();

        Cat thuy1 = new Cat();
        System.out.println(thuy1.sound());
    }
}
