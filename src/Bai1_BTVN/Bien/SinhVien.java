package Bai1_BTVN.Bien;

public class SinhVien {
    static String name1 = "Thanh Thuỷ"; // biến static
    String name2 = "Phan Hoàng"; // biến instance ko dùng đc  hàm main

    public static void main(String[] args) {
        int khoi = 7; // biến local
        System.out.println(khoi);
        System.out.println(name1);

        SinhVien sinhVien = new SinhVien(); // gọi thông qua đối tượng lớp
        System.out.println(sinhVien.name2);

        System.out.println(ThongTin.phone); // gọi biến static từ class thông tin
        System.out.println(ThongTin.tinhCach);
    }
}
