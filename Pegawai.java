/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pegawai;

/**
 *
 * @author User
 */
public class Pegawai {

    private String nama;
    private double gajiPokok;
    
    // setter
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    
    // getter
    public String getNama(){
        return this.nama;
    }
    
    public double getGajiPokok(){
        return this.gajiPokok;
    }
    
    
    public void cetakInfo(){
        System.out.println("Nama            : " + this.nama);
        System.out.println("Gaji Pokok      : " + this.gajiPokok);
    }

}


