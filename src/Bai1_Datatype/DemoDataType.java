package Bai1_Datatype;

public class DemoDataType {
    public static void main(String[] args) {
        String customerName ="Thuy1";
        String customer_name ="Thuy2";
        String COSTOMER_NAME ="Thuy3";

        char kitu = '1'; // dùng dấu nháy đơn chir có 1 ký tự

        int SoNguyenDuong = 2147483647;
        int SoNguyenAm = 2147483647;
        System.out.println(SoNguyenAm);


        long SoNguyenLong = 1562322147483647L;
        System.out.println(SoNguyenLong);

        float SoThuc = 10.5F;
        System.out.println(SoThuc);
        double SoThucDouble = 10.5; // bao trùm cả float
        System.out.println(SoThucDouble);
    }
}
