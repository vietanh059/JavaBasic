package Bai2_HamXayDung;

public class NhanVien {
    private String name;
    private int age;
    private String address;

    // hàm xây dựng không tham số
    public NhanVien(){
        name= "Thanh Thuỷ";
        age = 28;
        address = "Nghệ An";

    }
    // hàm xây dựng có tham số
    public NhanVien (String a, int b, String c){
        name = a;
        age = b;
        address = c;
    }

    public NhanVien (String name){
        this.name = name; // dùng từ khoá "this" để phân biệt thành phần trong clsss và bên ngoài (tham số/ class khác)
        age = 30;
        address = "Nghệ An";
    }

    public NhanVien (String name, int age, String address, String website ){
        this.name = name;
        this.age = age;
        this.address = address;
        Customer.website123 = website;
    }


    public void getInfor(){
        System.out.println(name+" "+age+" "+address);
    }

    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien();
        nhanVien1.getInfor();
        NhanVien nhanVien2 = new NhanVien("Quỳnh",23,"Nghệ An");
        nhanVien2.getInfor();
        NhanVien nhanVien3 = new NhanVien("Việt Anh");
        nhanVien3.getInfor();
        NhanVien nhanVien4 = new NhanVien("Hiếu",40,"Nghệ An","aaaaaaaaaaaaaaaaaa");
        nhanVien4.getInfor();
        System.out.println(Customer.website123);
    }
}
