package m.abdifirdaus_praktikum6;
import m.abdifirdaus_praktikum6.Mahasiswa;

public class MAbdiFirdaus_Praktikum6 {

    
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        
        mhs1.nama = "M. Abdi Firdaus";
        mhs1.npm = "2117051031";
        
        System.out.println("Nama: "+mhs1.nama);
        System.out.println("Nama: "+mhs1.npm);
        
        mhs1.insertNilaiUas(90);
        mhs1.insertNilaiUts(90);
        
        mhs1.dataMhs();
        System.out.println("nilai akhir: "+mhs1.nilaiAkhir());
    }
    
}
