package Bai2_HamXayDung;

public class HamXayDung {
    String name;
    String address;
    void display(){
        System.out.println(name +" "+ address);
    }
    public HamXayDung (String name, String address){
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        HamXayDung h1 = new HamXayDung("Thuỷ", "Nghệ An");
        HamXayDung h2 = new HamXayDung("Thảo", "Ha Nam");
        HamXayDung h3 = new HamXayDung("Hương", "Thái Bình");

        h1.display();



    }
}
