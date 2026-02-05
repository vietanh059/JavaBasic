package BaiChoMeo;

public class Dog extends Animal implements Spa{ //ke thua
    @Override //da hinh
    public String sound() {
        return "gau gau";
    }

    @Override
    public Animal tiaLong() {
        System.out.println("dang tia long cho " + this.name);
        return this;
    }

    @Override
    public Animal tiem(Animal animal) {
        return this;
    }
}
