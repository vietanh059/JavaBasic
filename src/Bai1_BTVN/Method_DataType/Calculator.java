package Bai1_BTVN.Method_DataType;

public class Calculator {
    public static int tong2SoNguyen (int number1, int number2){
        return number1 + number2;
    }
    public static float tich2SoThuc (float number1, float number2){
        return number1 * number2;
    }

    public static void main(String[] args) {
        System.out.println(tong2SoNguyen(10,20));
        System.out.println(tich2SoThuc(5F,10F));
    }
}
