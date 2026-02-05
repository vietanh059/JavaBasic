package CodGiaoDon;

public class ShopB2C extends Shop{
    @Override
    public Order submitOrder(){
        Order order = new Order();
        order.code = 123;
        order.shopType=1;
        return order;
    }


}
