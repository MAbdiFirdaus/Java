
package praktikum10_mabdifirdaus;


public class Segitiga extends bangunDatar {
    private double alas, tinggi;
    
    public Segitiga(double alas, double tinggi, String warna) {
        super(warna);
        this.alas=alas;
        this.tinggi=tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double luas(){
        return this.alas * this.tinggi/2;
    }
    @Override
    public double keliling(){
        return 3*this.alas;
    }
    
}


