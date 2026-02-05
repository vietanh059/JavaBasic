package Bai2_TinhDongGoi;

public class LoginTest {
    public static void main(String[] args) {
        DemoTinhDongGoi demoTinhDongGoi = new DemoTinhDongGoi();
        demoTinhDongGoi.setBrowser("EDGE");
        demoTinhDongGoi.setUrl("456");
        System.out.println(demoTinhDongGoi.getBrowser());
        System.out.println(demoTinhDongGoi.getEmail());
        System.out.println(demoTinhDongGoi.getPassword());
        System.out.println(demoTinhDongGoi.getUrl());
    }
}
