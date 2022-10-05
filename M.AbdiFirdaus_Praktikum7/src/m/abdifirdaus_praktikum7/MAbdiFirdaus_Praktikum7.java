/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.abdifirdaus_praktikum7;

/**
 *
 * @author Praktikan
 */
public class MAbdiFirdaus_Praktikum7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Mahasiswa mhs = new Mahasiswa();
        
        int result=mhs.sumValue(4,8);
        System.out.println(result);
        
        mhs.printdata("Ilmu Komputer");
        */
        Mahasiswa mhs2 = new Mahasiswa("abinurdin", "2117051031", 70, 66, 80);
        int result=mhs2.sumValue(4,8);
        System.out.println(result);
        
        mhs2.printdata("Ilmu Komputer");
        
        mhs2.setNama("ali nurdin");
        mhs2.setNpm("sudah di do");
        
        
        mhs2.printdata("teknik kelautan");
    }
    
}
