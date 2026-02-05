package BTVN_AHung;

import java.util.Scanner;

public class TamgiacChieuCaoNHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;

        // Dòng 1 đến dòng n-1
        for (int i = 1; i < n; i++) {

            // In khoảng trắng
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // In sao
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Dòng cuối: đáy tam giác
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("*");
        }
    }
}
