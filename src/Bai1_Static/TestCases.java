package Bai1_Static;

public class TestCases {
    public void testAddNewProject(){ // hàm non static
        System.out.println(DataConstants.browser);
    }
    public static void testLoginSuccess() {
        //testAddNewProject(); ko thể gọi biến hàm nonstatic vào hàm static
        System.out.println("Open browser"+ DataConstants.browser); // tên class. tên hàm (tên biến) để sử dụng loại static
        System.out.println("Navigate to url"+ DataConstants.url);
        System.out.println("Enter email and password...");
        System.out.println("Click login button");
        System.out.println("Verify...");
    }

    public static void testAddNewCustomer() {
        testLoginSuccess();
        System.out.println("Click menu Customer");
        System.out.println("Click button Add New Customer");
        System.out.println("Input data on form add new customer");
        System.out.println("Click Save button");
        System.out.println("Verify...");
    }

    // demo hàm
    public static void testAddNewTask(){
        testLoginSuccess();
        DataConstants.clickElement("Menu task");
        DataConstants.clickElement("Add New task");
        System.out.println("Input data for task");
        DataConstants.clickElement("Button save task");
        System.out.println("verify....");
    }

    public static void main(String[] args) {
         TestCases testCases = new TestCases();
//       testCases.testLoginSuccess();
         testLoginSuccess();
        System.out.println("---------------------------------");
        testAddNewCustomer();

        testCases.testAddNewProject();   // gọi hàm ko phải static cần phải khai báo TestCases testCases = new TestCases();
        System.out.println(DataConstants.browser);
        System.out.println("---------------------------------");

        // hàm
        testAddNewCustomer();


    }
}