package Bai1_Collection;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {
        Map<String, String> ListDevices = new HashMap<>();
        ListDevices.put("Device1", "Windows");
        ListDevices.put("Device2", "MacOS");
        ListDevices.put("Device1", "Linux");

        for (Map.Entry<String, String> entry : ListDevices.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
