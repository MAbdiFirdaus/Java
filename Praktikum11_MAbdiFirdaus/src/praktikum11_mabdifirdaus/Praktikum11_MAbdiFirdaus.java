/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum11_mabdifirdaus;

/**
 *
 * @author Praktikan
 */
public class Praktikum11_MAbdiFirdaus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BangunDatar Lingkaran = new Lingkaran(10, "Merah");
        BangunDatar SegiTiga = new SegiTiga(13, 5, "biru");
        BangunDatar SegiEmpat = new SegiEmpat(5, "Hitam");
        
    
    
    BangunDatar[] BangunDatar = new BangunDatar[3];
    BangunDatar[0] = Lingkaran;
    BangunDatar[1] = SegiTiga;
    BangunDatar[2] = SegiEmpat;
    
    for(int i = 0; i<3; i++){
        /*System.out.println("Bangun Datar " + (i+1));
        System.out.println("Warna: " + BangunDatar[i].getWarna());
        System.out.println("Luas: " + BangunDatar[i].luas());
        System.out.println("Keliling: " + BangunDatar[i].keliling());
        System.out.println();*/
        
        BangunDatar[i].Print();
    }
    
    }
    
}