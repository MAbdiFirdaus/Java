/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.abdifirdaus_praktikum6;

/**
 *
 * @author Praktikan
 */
public class Mahasiswa {
    public String nama = "subro";
    public String npm;
    private double nilaiUas;
    private double nilaiUts;
    
    public void insertNilaiUas(double nilai) {
        nilaiUas=nilai;
    }
    
    public void insertNilaiUts(double nilai) {
        nilaiUts=nilai;
    }
    
    public void dataMhs(){
        System.out.println("nama :"+nama);
        System.out.println("nama :"+npm);
        System.out.println("nama :"+nilaiUas);
        System.out.println("nama :"+nilaiUts);
    }
    
    public double nilaiAkhir(){
        double jumlah= nilaiUas+nilaiUts;
        return jumlah/2;
    }
}
