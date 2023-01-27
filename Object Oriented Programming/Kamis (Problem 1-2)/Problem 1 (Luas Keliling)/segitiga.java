public class segitiga {
    int alas;
    int tinggi;

    public segitiga(int alas, int tinggi)
    {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int hitungluas()
    {
        return (this.alas*this.tinggi)/2;
    }

    public int hitungkeliling()
    {
        return (this.alas*2)+this.tinggi;
    }
}
