package Bai1_ArrayList;

import java.util.ArrayList;

public class DemoArraylist2 {
    public static void main(String[] args) {
        ArrayList<String> ListMenu = new ArrayList<>();
        ListMenu.add("Dashboard");
        ListMenu.add("Customer");
        ListMenu.add("Sales");
        ListMenu.add("Subscriptions");
        ListMenu.add("Expenses");
        ListMenu.add("Contracts");
        for (int i = 0; i < ListMenu.size(); i++){
            System.out.println(ListMenu.get(i));
        }
        System.out.println("-----------------------------");

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(ListMenu); // thêm nguyên list menu vào list2
        list2.add("A");
        list2.add("B");
       // list2.removeAll(ListMenu); // xoá những thằng chỉ định
        list2.retainAll(ListMenu); // xoá ngược xoá những thằng ko chỉ định


        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        System.out.println("-----------------------------");
        // mo rộng
        ArrayList<Object> list3 = new ArrayList<>();
        list3.add("Thuy");
        list3.add(10);
        for (int i = 0; i < list3.size(); i++){
            System.out.println(list3.get(i));
            System.out.println(list3.get(i).equals("Thuy"));
            System.out.println("-----------------------");

        }
    }
}
