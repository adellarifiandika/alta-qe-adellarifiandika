public class ongkir extends inheritance {
    final double hargaDefault = 5000;
    double berat;

    void setPanjang(double number) {
        panjang = number;
    }

    void setLebar(double number) {
        lebar = number;
    }

    void setTinggi(double number) {
        tinggi = number;
    }

    public int hargaongkir()
    {
        double volumeDimensi = volume();
        if (volumeDimensi <= 50) {
            return (int) hargaDefault;
        } else {
            return (int) berat * 5000;
        }
    }
}
