package Bai1_Array;

public class DemoArray {
    public static void main(String[] args) {
        //khai bao mảng
        int mangSoNguyen[];
        // khởi tạo mảng gồm 10 phaanf tử
        mangSoNguyen = new int[10];
        // Khai báo và khởi tạo
        int mangSoNguyen2[] = new int[5];

        // khai báo và khởi tạo mảng dạng chuỗi
        String listmenu[] = new String[10];
        // gán giá trị vào mảng
        listmenu[0] = "Dashbpard"; // gán giá trị vào vị trí thứ nhất (bắt đầu là 0)
        listmenu[1] = "Customers"; // gán giá trị váo vị trí thứ hai..
        listmenu[7] = "Tasks";
        // Truy xuất giá trị thủ công từng vị trí
        System.out.println(listmenu[0]);
        System.out.println(listmenu[1]);
        System.out.println("-----------------------------------");
        // Duyệt mảng để lấy giá trị ra - dùng vòng lặp For
        for (int i = 0; i < listmenu.length; i++){    // listmenu.length nhỏ hơn độ dài của mảng listmenu
            System.out.println(listmenu[i]);
        }
        System.out.println("---------------------------------");
        // khai báo + khởi tạo + gán giá trị  mảng mặc danh cho mảng a
        int a[] = {33,3,4,5};
        // in mảng a ra màn hình
        for (int i=0; i < a.length; i++){
            System.out.println(a[i]+" ");
        }

    }
}
