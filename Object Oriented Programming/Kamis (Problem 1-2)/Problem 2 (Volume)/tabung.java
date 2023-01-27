public class tabung {
    double r;
    int tinggi;

    public tabung(double r, int tinggi)
    {
        this.r = r;
        this.tinggi = tinggi;
    }

    public double volume()
    {
        double volume = Math.PI * Math.pow(r,2) * this.tinggi;
        return Math.ceil(volume);
    }
}
