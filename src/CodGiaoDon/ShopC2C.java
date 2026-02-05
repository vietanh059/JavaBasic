package CodGiaoDon;

public class ShopC2C extends Shop{
    @Override
    public Order submitOrder(){
        Order order = new Order();
        order.code = 123;
        order.shopType=2;
        return order;
    }
}
