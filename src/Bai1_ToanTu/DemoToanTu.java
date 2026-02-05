package Bai1_ToanTu;
// shift + ctrl + alt + L

public class DemoToanTu {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // số học
        System.out.println("a % b = " + (a % b));
        //System.out.println(a++);
        // a++;
        int c = a;
        System.out.println(c);
        b++; // ch nên ++, -- cho 1 biến ko mang kết hợp trong phép toán
        c = a + b;
        System.out.println(c);
        System.out.println(b);

        // quan hệ so sánh
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);

        // toán tử logic - kết ợp nhiều điều kện/ phép toán
        System.out.println("Logic && " + ((a > b) && (b > c)));
        System.out.println("Logic || " + ((a > b) || (b > c)));

        // toan tu dieu kien
        int m = 20;
        int p = 2;

        String s = (m % p == 0)  ? "m chia het p" : "m k chia het p";
        System.out.println(s);

        int t = (m % p == 0)  ? 100 : 1000;
        System.out.println(t);

        // toan tu gan
        int a1 = 20;
        int a2,a3,a4;
        a2=a3=a4=a1;
        System.out.println(a2);
        System.out.println(a3);


    }
}
