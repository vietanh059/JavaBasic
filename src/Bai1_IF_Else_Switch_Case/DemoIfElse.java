package Bai1_IF_Else_Switch_Case;

public class DemoIfElse {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        String expected = "Customer Summary";

        // mệnh đề if
        if ((a < b) && (expected.equals("Customer Summary"))) { // ghép nhiều đk với nhau
            System.out.println("a<b");
        }

        if (expected.equals("Customer Summary")) {
            System.out.println("Pass");
        }

        // mệnh đề if else
        if (a > b) {
            System.out.println("A>B");
        } else {
            System.out.println("A<B");
        }

        // mệnh đề if else if

        int marks = 65;

        if (marks < 50) {
            System.out.println("Tạch!");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Xếp loại D");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Xếp loại C");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Xếp loại B");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Xếp loại A");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("Xếp loại A+");
        } else {
            System.out.println("Giá trị không hợp lệ!");
        }

    }
}
