public class persegi {
    int sisi;

    public persegi(int sisi)
    {
        this.sisi = sisi;
    }

    public int hitungluas()
    {
        return this.sisi*this.sisi;
    }

    public int hitungkeliling()
    {
        return 4*this.sisi;
    }
}
