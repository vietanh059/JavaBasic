package Bai1_BTVN.ToanTu_IfElse;

public class BaiTap {

    static void soSanhDK(int n){
        int number = 100;

        if (n == number){
            System.out.println(n +"=" + number);
        } else if (n < number) {
            System.out.println(n +"<" + number);
        } else {
            System.out.println(n +">" + number);
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 10;

        System.out.println(a>b);
        System.out.println(b<c);

        System.out.println((a<b) && (b>c));
        System.out.println((a<b)||(b>c));

        soSanhDK(20);

    }
}
