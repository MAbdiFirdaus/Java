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
public class Mahasiswa {
    private String nama;
    private String npm;
    private double nilaiTugas;
    private double nilaiUas;
    private double nilaiUts;
    private double NA;
    
    public void printdata(String jurusan){
        System.out.println("NPM\t:"+this.getNpm());
        System.out.println("Nama\t:"+this.getNama());
        System.out.println("jurusan\t:"+jurusan);
    }
    
    public int sumValue(int x,int y){
        return y+x;
    }
    
    public void hitungNA(){
        this.setNA((getNilaiTugas() * 0.3) + (getNilaiUts() * 0.35) + (getNilaiUas() + 0.35));
    }
    
    public void hitungNA(double nilaiTugas, double nilaiUts, double nilaiUas){
        this.setNA((nilaiTugas*0.3)+(nilaiUts*0.35)+(nilaiUas+0.35));
    }
    
    public void hitungNA(String pesan){
        System.out.println("nilai tidak valid");
    }
    
    public Mahasiswa(String nama, String npm, double nilaiTugas, double nilaiUts, double nilaiUas){
        this.nama=nama;
        this.npm=npm;
        this.nilaiTugas=nilaiTugas;
        this.nilaiUts=nilaiUts;
        this.nilaiUas=nilaiUas;
        
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setNpm(String npm){
        this.npm=npm;
    }
    public String getNpm(){
        return npm;
    }
    public void setNilaiTugas(double nilaiTugas){
        this.nilaiTugas=nilaiTugas;
    }
    public double getNilaiTugas(){
        return nilaiTugas;
    }

    /**
     * @return the nilaiUas
     */
    public double getNilaiUas() {
        return nilaiUas;
    }

    /**
     * @param nilaiUas the nilaiUas to set
     */
    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    /**
     * @return the nilaiUts
     */
    public double getNilaiUts() {
        return nilaiUts;
    }

    /**
     * @param nilaiUts the nilaiUts to set
     */
    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    /**
     * @return the NA
     */
    public double getNA() {
        return NA;
    }

    /**
     * @param NA the NA to set
     */
    public void setNA(double NA) {
        this.NA = NA;
    }
    
}
