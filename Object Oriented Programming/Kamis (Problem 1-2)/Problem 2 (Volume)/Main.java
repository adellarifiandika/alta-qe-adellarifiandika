public class Main {
    public static void main(String[] args) {
        //membuat objek
        balok Balok = new balok(6,3,10);
        kubus Kubus = new kubus(10);
        tabung Tabung = new tabung(7,10);

        System.out.println("--- Menghitung Volume ---");
        System.out.println("Balok (" +Balok.volume()+ ")" );
        System.out.println("Kubus (" +Kubus.volume()+ ")" );
        System.out.println("Tabung (" +Tabung.volume()+ ")" );
    }
}