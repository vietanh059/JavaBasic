package CodGiaoDon;

public class ThucHanh {
    public static void main(String[] args) {
        // 1) Tạo shop và set tên
        Shop shop1 = new ShopC2C();
        shop1.shopName = "Hằng Du Mục";

        // 2) Shop đăng đơn => nhận về Order có code=123
        Order order1 = shop1.submitOrder();
        System.out.println("Shop " + shop1.shopName + " đăng đơn mã: " + order1.code);

        // 3) Tạo cod và set tên
        Cod cod1 = new Cod();
        cod1.nameCod = "Quang Linh";

        // 4) Cod nhận đơn và đi giao
        cod1.orderDelivery(order1);
    }
}
