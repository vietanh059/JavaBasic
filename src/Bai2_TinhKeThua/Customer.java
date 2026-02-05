package Bai2_TinhKeThua;

public class Customer extends Person{
    public Customer(String name, int age, float height, String phone) {
        super(name, age, height, phone);
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Long",35,15.5F,"01234343");
        customer.getInfo();
    }
}
