package Bai2_TinhKeThua;

public class Student extends Person{
    private String address;
    String name = "Meobeo";
// Class cha có hàm xây dựng (constructor có tham số nên class con bắt buộc phải gọi)
    public Student(String name, int age, float height, String address) {
        super(name, age, height); //dđảm bảo đúng cấu trúc constructor từ class Person
    }

    public void showInfor(){
        System.out.println("This is chils class");
    }

    public void getInfo() {
        System.out.println("Name:" + super.name); // gọi biến từ class cha person
        System.out.println("Age:" + this.age);
        System.out.println("Height:" + this.height);
        System.out.println("Address:" + "Cần Thơ");
        super.getInfo(); // gọi hàm  từ class cha person
    }

    public static void main(String[] args) {
        Student student = new Student("Hương",30,48.5F,"Hà Nội");
        student.getInfo();
        System.out.println("Vriable name: "+student.name);
        student.showInfor();
        Person.getName();
    }
}
