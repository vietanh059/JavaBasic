package Bai1_Collection;

import java.util.HashSet;
import java.util.Set;

public class DemoCollectionSet {
    public static void main(String[] args) {
        Set<String> ListSession = new HashSet<>();
        ListSession.add("123");
        ListSession.add("1232");
        ListSession.add("12322");

        ListSession.remove("123");

        System.out.println(ListSession.contains("1232"));
        System.out.println(ListSession.contains("0000"));

        for (String sesion : ListSession){
            System.out.println(sesion);
        }

    }
}
