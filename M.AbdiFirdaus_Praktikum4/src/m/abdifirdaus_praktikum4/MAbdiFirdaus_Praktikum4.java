/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.abdifirdaus_praktikum4;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class MAbdiFirdaus_Praktikum4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[]number={1,3,5,7,9}; //deklarasi array
        
        System.out.println(number);
        
        //looping untuk mengeluarkan nilai array
        for(int i = 0; i<5; i++){
            System.out.println(number[i]);
        }
        
        //looping menggunskan ukuran dari arraynya
        for(int i = 0; i<number.length; i++){
            System.out.println(number[i]);
        }
        
        //looping dengan each for
        for(int num : number ){
            System.out.println(num);
        }
        Scanner input = new Scanner(System.in);
        int nilai[]=new int[3];
        System.out.print("nilai matematika : ");
        nilai[0]=input.nextInt();
        System.out.print("nilai logika : ");
        nilai[1]=input.nextInt();
        System.out.print("nilai bahasa : ");
        nilai[2]=input.nextInt();
        
        nilai[1]=0;
        
        for(int print:nilai){
            System.out.println(print + " ");
        }
        nilai[1]=0;
        
        int nil[][]={{90,75,80},
                    {80,90,80},
                    {70,75,95}};
        for(int[] i:nil){
            System.out.print("[");
            for(int j : i){
                System.out.print(j + ",");
            }
            System.out.println("]");
        }
        
        
    }
    
}
