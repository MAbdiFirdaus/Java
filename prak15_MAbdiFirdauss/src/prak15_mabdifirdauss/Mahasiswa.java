/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak15_mabdifirdauss;

/**
 *
 * @author Praktikan
 */
public class Mahasiswa {
    private String Nama,Npm,Alamat;

    public Mahasiswa(String Nama, String Npm, String Alamat) {
        this.Nama = Nama;
        this.Npm = Npm;
        this.Alamat = Alamat;
    }
    
    

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNpm() {
        return Npm;
    }

    public void setNpm(String Npm) {
        this.Npm = Npm;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
}
