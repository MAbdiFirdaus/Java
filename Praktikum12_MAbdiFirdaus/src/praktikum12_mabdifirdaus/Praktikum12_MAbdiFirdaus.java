/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum12_mabdifirdaus;
import java.util.ArrayList;

/**
 *
 * @author Praktikan
 */
public class Praktikum12_MAbdiFirdaus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> nilai = new ArrayList<Integer>();
//        nilai.add(70);
//        nilai.add(75);
//        nilai.add(80);
        
        System.out.println(nilai);
        
        Mahasiswa mhs1 = new Mahasiswa("Naufal","2117051031", nilai);
        
//        mhs1.setNilai(nilai);
        
        mhs1.nilaiRataRata();
    }
    
}
