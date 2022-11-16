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
public class MAbdiFirdaus_Praktikum9 {

    public String atributBukanStatic = "Atribut Bukan Static";
    static String atributStatic = " Atribut Static";
    public void bukanStatic(){
        System.out.println("Bukan Static");
    }
    public static class Tabung {
        
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
    
    static void methodStatic(){
        System.out.println("Method Static");
    }
    public static void main(String[] args) {
        MAbdiFirdaus_Praktikum9 praktikum = new MAbdiFirdaus_Praktikum9();
        System.out.println(praktikum.atributBukanStatic);
        praktikum.bukanStatic();
       
        methodStatic();
        System.out.println(praktikum.atributBukanStatic);
        System.out.println(atributStatic);
        System.out.println();
        
        double r = 13;
        double t = 30;
        
        double vol = Tabung.volume(r, t);
        double lp = Tabung.LuasPermukaan(r, t);
        
        System.out.println(vol);
        System.out.println(lp);
    }
    
}
