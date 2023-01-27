import java.util.Scanner;

public class palindrome_inputanuser {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input kata = ");
        String value = input.nextLine();
        System.out.print(value + " " + palindrome(value));
    }

    private static boolean palindrome(String value)
    {
        String temp = ""; // untuk menampung tiap karakter dari 'value' yang diinput
        for ( int i = (value.length()-1); i>=0; i-- )
        // saat i sama dengan jumlah karakter tiap indeks di string value ; i lebih dari 0; i akan semakin berkurang
        {
            temp += String.valueOf(value.charAt(i)).toString();
            // temp akan diisi dengan karakter dari tiap indeks di 'string value' lagi (disusun kembali)
            // (value.charAt(i)) -> string value akan mengembalikan tiap karakternya pada indeks i
        }
        if ( value.equals(temp) ) // jika saat string value dibandingkan dengan string
                                    // pada temp memiliki hasil yang sama maka...
        {
            return true; // kembalikan hasil (cetak) true
        }
        else
        {
            return false; // kembalikan hasil (cetak) false
        }
    }

}
