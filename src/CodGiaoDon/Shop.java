package CodGiaoDon;

public class Shop {
    public String shopName ="Hang Du Muc";

//    public Order submitOrder() { // gọi submitOrder nhận đc đơn hàng
//        Order ordera = new Order(); // tạo đơn hàng mới và đặt tên cho nó là ordera
//        ordera.code = 123; // gán mã đơn 123 cho ordera
//        return ordera;

    public Order submitOrder(){
        return null;
    }
}


// Bạn dùng Order ở đây vì hành động submitOrder() của Shop là “đăng đơn” ⇒ kết quả của hành động đó phải là một “đơn hàng”.
// Mà “đơn hàng” trong code của bạn được mô hình hoá bằng class Order
// submitOrder() = đăng đơn. đăng đơn xong phải ra 1 đơn (có code, shopType, địa chỉ…) → nên hàm phải trả về Order