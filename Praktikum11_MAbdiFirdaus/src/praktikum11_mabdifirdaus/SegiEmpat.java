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
public class SegiEmpat extends BangunDatar{
    private double sisi;

    public SegiEmpat(double sisi, String warna) {
        this.sisi = sisi;
        this.warna = warna;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public String getWarna() {
        return warna;
    }
    
    @Override
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    @Override
    public double keliling(){
        return 4*sisi;
    }
    
    @Override
    public double luas(){
        return sisi*sisi;
    }
    
    @Override
    public void Print(){
        System.out.println("Segi Empat");
        System.out.println("Warna: " + getWarna());
        System.out.println("Sisi: " + getSisi());
        System.out.println("Luas: " + luas());
        System.out.println("Keliling: " + keliling());
        System.out.println();

    }
}
