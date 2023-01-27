import java.util.Scanner;
public class luas_segitiga {
    public static void main(String[] args) {
        float a, t, luas;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai alas   = ");
        a = input.nextInt();
        System.out.print("Masukkan nilai tinggi = ");
        t = input.nextInt();

        luas = a * t / 2;
        System.out.println("Luas segitiga adalah "+luas);
    }
}
