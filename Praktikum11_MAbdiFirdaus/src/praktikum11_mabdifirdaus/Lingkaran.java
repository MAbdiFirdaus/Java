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
public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(double jari, String warna) {
        this.jari = jari;
        this.warna = warna;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
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
        return 2*Math.PI*jari;
    }
    
    @Override
    public double luas(){
        return Math.PI*jari*jari;
    }
    
    @Override
    public void Print(){
        System.out.println("Lingkaran");
        System.out.println("Warna: " + getWarna());
        System.out.println("Jari-jari: " + getJari());
        System.out.println("Luas: " + luas());
        System.out.println("Keliling: " + keliling());
        System.out.println();
    }
}
