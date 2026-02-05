package Bai1_Variables;

public class DemoBien {
    String address = "hà nội"; // bien instance, ko dùng đc ở hàm main
    int zip_code = 12345;
    static String phone = "0855634877"; // bien static dùng đc ở hàm main

    public void sayHello() {
        int number = 10;
        int a = 5;
        int b = a + number;
        System.out.println(b);
        System.out.println(this.address);
        System.out.println(this.zip_code);
        System.out.println(phone);
        System.out.println(phone);
    }

    public void getInfo() {
        System.out.println(this.address);
        System.out.println(this.zip_code);
    }

    public static void main(String[] args) {
        System.out.println(phone);
        System.out.println("1");
    }
}
