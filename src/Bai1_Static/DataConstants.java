package Bai1_Static;

public class DataConstants {
    public static String  browser = "Chome";
    public static String url = "https://anhtester.com";

    // hàm static
    public static String getCurrentUrl (){
        return"xử lý...";
    }

    public static void clickElement(String elementName){
        System.out.println("Click on element"+ elementName);
    }

//    public void clickLoginButton(){ // ko nên dùng bị lặp code, dùng hàm trêb
//
//    }
//
//    public void clickMenuCustomer(){
//
//    }
}
