import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double panjang, lebar, tinggi, berat;
        Scanner input = new Scanner(System.in);
        System.out.print("Panjang : ");
        panjang = input.nextDouble();
        System.out.print("Lebar : ");
        lebar = input.nextDouble();
        System.out.print("Tinggi : ");
        tinggi = input.nextDouble();
        System.out.print("Berat : ");
        berat = input.nextDouble();
        System.out.println();

        ongkir pengirimanBarang = new ongkir();
        pengirimanBarang.setPanjang(panjang);
        pengirimanBarang.setLebar(lebar);
        pengirimanBarang.setTinggi(tinggi);
        pengirimanBarang.berat = berat;
        System.out.println("Ongkos Kirim : " + pengirimanBarang.hargaongkir());
    }
}