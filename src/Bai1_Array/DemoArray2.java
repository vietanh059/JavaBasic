package Bai1_Array;

public class DemoArray2 {

    static void min(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i]) {
                min = arr[i];
            }
        System.out.println(min);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 33, 3, 4, 5, 1 };
        min(a);// truyền mảng tới phương thức

        System.out.println("____________________________");
        // số chẵn trong mảng
        int[] arr = {1, 2, 3, 4, 6, 9, 10};

        for (int x : arr) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }


}

