import java.util.Arrays;
import java.util.Scanner;

public class mean_inputanuser
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int value[] = new int[0];
        System.out.print("Input angka (pisahkan dengan koma) = ");
        float numbers = Float.parseFloat(input.nextLine());
        System.out.print(" Array nya adalah " + Arrays.toString(value));

    }

    private static float Mean(float[]numbers)
    {
        float total = 0;
        int i;
        int n = numbers.length;
        for ( i = 0; i < n; i++ )
        // saat i = 0 ; i kurang dari jumlah banyaknya angka pada var 'numbers'; i akan bertambah
        {
            total += numbers[i];
            // variable 'total' akan diisi dengan penjumlahan angka ditiap indeks var 'numbers'
        }
        return total/n;
        // dikembalikan hasil mean yaitu pembagian hasil variable total dengan jumlah banyaknya angka pada var 'numbers'
    }
}
