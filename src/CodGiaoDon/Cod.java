package CodGiaoDon;

public class Cod{
    public String nameCod = "A";
    public void orderDelivery(Order order){ // kiểu sữ lệu - tên biến
        System.out.println("Cod" + nameCod + " sẽ nhận đơn và đi giao mã đơn"+ order.code + " shopType=" + order.shopType);
    }


}
// COD muốn giao được thì phải nhận vào 1 đơn hàng (kiểu Order) (chữ đầu) = kiểu dữ liệu (class Order), (chữ sau) = tên biến dùng trong hàm
// lưu ý chỗ này muốn dùng đc biến code là shoptype của class Order thì phải khai báo tham số
// (Order order) cho hàm nghĩa là . Lúc đó biến đc gọi qua order (viết thường)