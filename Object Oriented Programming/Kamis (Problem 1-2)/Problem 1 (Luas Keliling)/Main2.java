public class Main2 {
    public static void main(String[] args) {

       //membuat objek
       persegi Persegi = new persegi(4);
       persegipanjang PersegiPanjang = new persegipanjang(7,8);
       segitiga Segitiga = new segitiga(3,4);

       System.out.println("--- Menghitung Luas ---");
       System.out.println("Persegi (" +Persegi.hitungluas()+ ")" );
       System.out.println("Persegi Panjang (" +PersegiPanjang.hitungluas()+ ")" );
       System.out.println("Segitiga (" +Segitiga.hitungluas()+ ")" );

       System.out.println("--- Menghitung Keliling ---");
       System.out.println("Persegi (" +Persegi.hitungkeliling()+ ")" );
       System.out.println("Persegi Panjang (" +PersegiPanjang.hitungkeliling()+ ")" );
       System.out.println("Segitiga (" +Segitiga.hitungkeliling()+ ")" );
    }

}