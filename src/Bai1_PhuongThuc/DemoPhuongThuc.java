package Bai1_PhuongThuc;
// k đc khai báo hàm trong hàm

public class DemoPhuongThuc {
    // hàm ko trả về kết quả
    public static void login() {
        System.out.println("set email");
    }

    // hàm có trả về kết quả
    public static String getHeaderPage() {
        System.out.println("Dùng selenium để lấy được cái header page");
        String header = "Customer Sumary";

        return header;
    }

    // hàm ko trả về kết quả + có tham số
    public static void login(String email, String password) {
        System.out.println("set email " + email);
        System.out.println("set email " + password);
        System.out.println("Click login ");
    }

    public static int sum(int a, int b) {
    return  a + b;
    }

    public static int getCustomerTotal() {// tên hàm viết thường đầu tiên
        // dùng selenium để get customer total

        int  customerTotal = 350;
        return customerTotal;

    }

    public static int getCustomerDeActive() {// tên hàm viết thường đầu tiên
        // dùng selenium để get customer total

        int  customerDeActive = 150;
        return customerDeActive;

    }


    public static void main(String[] args) { // hàm main - hàm chạy đc
        String value2 = getHeaderPage();
        System.out.println(value2);

        login("thuy123@gmail.com", "thuy123");
        login("meomeo@gmail.com", "thuy1234");

        int valueSum = sum (123,345);
        System.out.println(valueSum);

        System.out.println(getCustomerTotal() + getCustomerDeActive());

        System.out.println();


    }
}
