package Bai1_BTVN.For_ArrayList;

import java.util.ArrayList;

public class for_arrayList {
    public static void thongTinNhanVien(){
        ArrayList<String> nhanVien = new ArrayList<>();
        nhanVien.add("Thuỷ");
        nhanVien.add("Nữ");
        nhanVien.add("Nghệ An");

        for (String iteam : nhanVien){
            System.out.println(iteam);
        }
    }

    public static ArrayList<String> thongTinNhanVien1 (String name, String gender, String address){
        ArrayList<String> nhanVien1 = new ArrayList<>();
        nhanVien1.add(name);
        nhanVien1.add(gender);
        nhanVien1.add(address);
        return nhanVien1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> listSoChan = new ArrayList<>();

        for (int i = 1; i <= 50; i ++){
            if (i % 2 == 0){
                System.out.println(i + " là số chẵn");
                listSoChan.add(i);
            }
        }

        for (int iteam : listSoChan){
            System.out.println(iteam);
        }

        thongTinNhanVien();

        ArrayList<String> nhanvien = thongTinNhanVien1("Thảo","Nữ","Hà Nội");
        for (String iteam : nhanvien) {
            System.out.println(iteam);
        }
    }
}
