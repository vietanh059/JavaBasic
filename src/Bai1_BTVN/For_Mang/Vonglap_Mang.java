package Bai1_BTVN.For_Mang;

public class Vonglap_Mang {
    public static void main(String[] args) {
        int mangSoChan[] = new int[26];
        int index = 0;

        for (int i = 0; i <= 50; i ++){
            if (i % 2 == 0){
                System.out.println(i + " là số chẵn");
                mangSoChan[index] = i; // gán giá trị số chẵn vào vị trí tuần tự trong mảng
                index++;
            }
        }

        for (int iteam : mangSoChan){
            System.out.println(iteam);
        }
    }
}
