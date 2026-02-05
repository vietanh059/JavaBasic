package Bai1_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> ListMenu = new ArrayList<>();

        ListMenu.add("Dashboard");
        ListMenu.add("Customer");
        ListMenu.add("Sales");
        ListMenu.add("Contracts");
        ListMenu.add("Subscriptions");
        ListMenu.add("Expenses");
        ListMenu.add("Contracts");

        ListMenu.remove(2);
        ListMenu.add(2, "Projects");

        System.out.println("Check value: " + ListMenu.contains("Contracts")); // tìm kiếm

        System.out.println(ListMenu.indexOf("Contracts")); // vị trí của... (vị trí đầu)

        System.out.println(ListMenu.lastIndexOf("Contracts")); // vị trí cuối


        // dùng hàm for each
//        for (String menu : ListMenu) {
//            System.out.println(menu);
//        }
        // dùng hàm for thường
        for (int i = 0; i < ListMenu.size(); i++) {
            System.out.println(ListMenu.get(i));
        }

        System.out.println("------------------");
        // chuyển arraylist sang mảng
        Object mangMenu[] =  ListMenu.toArray();

        for (Object item: mangMenu){
            System.out.println(item);
        }
        System.out.println("--------------------------");
        // chuyển mảng sang arraylist
        List<Object> listconverted = new ArrayList<>();
        listconverted = Arrays.asList(mangMenu);
        for (Object item: listconverted){
            System.out.println(item);
        }
    }
}
