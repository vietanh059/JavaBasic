package BaiChoMeo;

public class Cat extends Animal{
    @Override
    public String sound() {
        System.out.println(super.sound());
        return "meo meo";
    }
}
