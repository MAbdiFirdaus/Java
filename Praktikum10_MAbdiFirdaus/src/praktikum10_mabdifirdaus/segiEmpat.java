/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10_mabdifirdaus;

import java.util.logging.Logger;

/**
 *
 * @author Praktikan
 */
public class segiEmpat extends bangunDatar {
    private double sisi;

    public segiEmpat(double sisi, String warna) {
        super(warna);
        this.sisi = sisi;
    }
    
    @Override
    public double luas(){
        return this.sisi*this.sisi;
    }
    
    @Override
    public double keliling(){
        return 4*this.sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    
  
}
