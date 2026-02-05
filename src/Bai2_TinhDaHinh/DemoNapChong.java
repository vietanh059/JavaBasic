package Bai2_TinhDaHinh;

public class DemoNapChong extends baseTest {
    // đa hình: giống tên hàm nhưng khác nhau số lượng tham số
    public void clickElement(){
        System.out.println("Click on element");
        super.clickElement();
    }

    public void clickElement(String elementName){
        System.out.println("Click on element "+ elementName);
    }

    public void clickElement(String elementName, int timeout){
        System.out.println("Click on element "+elementName+ "with timeout "+timeout);
    }

    // đa hình: giống tên hàm, giống Sl tham số nhưng khác nhau kiểu dữ liệu tham số
    public void clickElement(String elementName, double timeout){
        System.out.println("Click on element "+elementName+ "with timeout "+timeout);
    }

    public static void main(String[] args) {
        DemoNapChong demoNapChong = new DemoNapChong();
        demoNapChong.clickElement();
        demoNapChong.clickElement("Login button");
        demoNapChong.clickElement("Menu customer", 10);

        baseTest baseTest = new baseTest();
        baseTest.clickElement();

    }

}
