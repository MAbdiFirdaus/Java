
package praktikum10_mabdifirdaus;


public class Praktikum10_MAbdiFirdaus {

    public static void main(String[] args) {
        
      bangunDatar bd = new bangunDatar("hitam");
        System.out.println("Warna bangun datar: "+bd.getWarna());
        System.out.println();    
        
        Lingkaran lingkaran = new Lingkaran(26.0, "Merah" );
        System.out.println("Luas Lingkaran: "+ lingkaran.luas());
        System.out.println("Keliling lingkaran: " + lingkaran.keliling());
        System.out.println();
        
        Segitiga segitiga = new Segitiga(15.0, 7.0, "kuning");
        System.out.println("luas Segi tiga: "+segitiga.luas());
        System.out.println("Keliling Segitiga: "+ segitiga.keliling());
        System.out.println();
        
        segiEmpat segiempat = new segiEmpat(10.0, "Hijau");
        System.out.println("luas Segi tiga: "+segiempat.luas());
        System.out.println("Keliling Segitiga: "+ segiempat.keliling());
        System.out.println();
    }
    
}
