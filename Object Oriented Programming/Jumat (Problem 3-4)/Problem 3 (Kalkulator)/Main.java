public class Main {
    public static void main(String[] args) {
        System.out.println( "---KALKULATOR---");

        //membuat objek
        kalkulator Kalkulator = new kalkulator();

        System.out.println("--- OUTPUT---");
        Kalkulator.Coba(3,4);
        System.out.println("Penjumlahan (" +Kalkulator.penjumlahan() + ")" );

        Kalkulator.Coba(15,4);
        System.out.println("Pengurangan (" +Kalkulator.pengurangan() + ")" );

        Kalkulator.Coba(10,10);
        System.out.println("Perkalian (" +Kalkulator.perkalian() + ")" );

        Kalkulator.Coba(12,3);
        System.out.println("Pembagian (" +Kalkulator.pembagian() + ")" );
    }
}