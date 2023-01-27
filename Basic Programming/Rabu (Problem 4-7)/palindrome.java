public class palindrome {
    public static void main(String[] args)
    {
        System.out.println(palindrome("civic")); // true
        System.out.println(palindrome("katak")); // true
        System.out.println(palindrome("kasur rusak")); // true
        System.out.println(palindrome("kupu-kupu")); // false
        System.out.println(palindrome("lion")); // false
    }

    private static boolean palindrome(String value)
    {
        String temp = ""; // untuk menampung tiap karakter dari 'value' yang diinput
        for ( int i = (value.length()-1); i>=0; i-- )
        // saat i sama dengan jumlah karakter tiap indeks di string value ; i lebih dari 0; i akan dikurangi
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
