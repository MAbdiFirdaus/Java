/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.abdifirdaus_praktikum5;

/**
 *
 * @author Praktikan
 */
public class MAbdiFirdaus_Praktikum5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstName = "ervan";
        String lastName = "chodry";
        
        System.out.println(firstName);
        System.out.println(lastName);
        
        String fullName = "Ervan"+" "+"Chodry";
        String fullName2 = firstName + " " + lastName;
        
        System.out.println(fullName2);
        
        String upper = fullName2.toUpperCase();
        String lower = fullName2.toLowerCase();
        
        System.out.println(upper);
        System.out.println(lower);
        
        int panjang = fullName2.length();
        System.out.println(panjang);
        
        System.out.println(fullName.substring(6,9));
        
         
    }
    
}
