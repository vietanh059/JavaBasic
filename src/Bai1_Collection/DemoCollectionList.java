package Bai1_Collection;

import java.util.ArrayList;
import java.util.List;

public class DemoCollectionList {
    public static void main(String[] args) {
        List<String> ListMenu = new ArrayList<>();
        ListMenu.add("Dasdboard");
        ListMenu.add("Customer");
        ListMenu.add("Thuy");

        System.out.println(ListMenu.size()); // kích cỡ, hàm get lấy ra

        ListMenu.remove(1); // xoá

        for (int i=0; i< ListMenu.size(); i++){
            System.out.println(ListMenu.get(i));
        }
    }
}
