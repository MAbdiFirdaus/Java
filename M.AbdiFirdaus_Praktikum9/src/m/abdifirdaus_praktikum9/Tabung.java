/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.abdifirdaus_praktikum9;

/**
 *
 * @author Praktikan
 */
public class Tabung {
    private static final double phi = Math.PI;

    public static double getPhi() {
        return phi;
    }
    
    public static double volume(double jari, double tinggi){
        
        return getPhi()*jari*jari*tinggi;
    }

   public static double LuasPermukaan(double r, double t){
    return (2*getPhi()*r*(r+t));
}
   
}