package Bai1_Xulychuoi;

public class DemoXuLyChuoi {
    public static void main(String[] args) {
        String str1 = "Java for tester";
        String str2 = "Selenium";
        String str3 = " TestNG ";

        System.out.println("cắt chuỗi: " + str1.substring(5)); // cắt vị trí bắt đầu
        System.out.println("cắt chuỗi: " + str1.substring(5,8)); // cắt vị trí bắt đầu và kết thúc

        System.out.println("Độ dài chuỗi: "+ str1.length());
        System.out.println("Vị tri ký tự trong chuỗi: "+ str1.indexOf("a"));
        System.out.println("Vị tri ký tự trong chuỗi: "+ str1.indexOf("a",2)); // vị trí của a tính từ ký tự thứ 2

        System.out.println("------------------------------");
        String tachChuoi[] = str1.split(" "); // tách chuỗi theo khoảng trắng
        for (String iteam: tachChuoi){
            System.out.println(iteam);
        }

        System.out.println("Chu in hoa " + str2.toUpperCase());

        String temp= str1.replace(" ","-"); // chuyển khoảng khắng thành dấu nối
        System.out.println(temp);

        System.out.println("Kiểm tra rỗng " + str2.isEmpty());

        // chuyển chuỗi thành mảng ký tự
        char mangChar[] = str2.toCharArray();
        for (char item: mangChar){
            System.out.println(item);
        }

        System.out.println("-----------------");
        System.out.println(str3);
        System.out.println(str3.trim());

        // Chuyển kiểu dữ liệu khác sang dạng chuỗi
        System.out.println(String.valueOf(12345) + 5);

        // Chuyển kiểu dữ liệu chuỗi về dạng số
        System.out.println(Integer.parseInt("12345")+5);

        // Tách số từ chuỗi
        String strTasks = "Task assigned to me: 78";
        System.out.println(strTasks.substring(strTasks.length()-2)); // chiều dài -2

        int itemTotal = strTasks.split(" ").length;
        System.out.println(itemTotal);
        String listIteam[] = strTasks.split(" ");
        System.out.println(listIteam[itemTotal-1]);


    }
}
