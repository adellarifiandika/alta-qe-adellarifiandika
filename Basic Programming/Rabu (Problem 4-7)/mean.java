public class mean
{
    public static void main(String[] args)
    {
        float[] value = {1,2,3,4};
        System.out.println(Mean(value));
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
