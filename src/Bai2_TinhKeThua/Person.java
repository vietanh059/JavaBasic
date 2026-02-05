package Bai2_TinhKeThua;

public class Person {
    public String name;
    public int age;
    public float height;
    public String phone;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Person(String name, int age, float height, String phone) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.phone = phone;
    }

    public  static  void getName(){
        System.out.println("get name");
    }

    public void getInfo() {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Height:" + this.height);
    }

    public static void main(String[] args) {
        Person person = new Person("Thảo", 25, 15.5F);

    }
}
