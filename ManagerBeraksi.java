/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawai;

/**
 *
 * @author User
 */
public class ManagerBeraksi {
     public static void main(String[] args){
        
        // Membuat Object 1
        Manager wida = new Manager();
         /* memanggil atribut dan memberi nilai*/
        wida.setNama("Widayanti");
        wida.setGajiPokok (5500000.00);
        wida.setTunjangan (500000.00);
        // untuk menampilkan hasilnya
        System.out.println("Nama        : " + wida.getNama());
        System.out.println("Gaji Pokok  : " + wida.getGajiPokok());
        System.out.println("Tunjangan   : " + wida.getTunjangan());
        
   
        // Membuat Object 2
        Manager yanto = new Manager();
        /* memanggil atribut dan memberi nilai*/
        yanto.setNama ("Yanto Suyanto");
        yanto.setGajiPokok (5500000.00);
        yanto.setTunjangan (550000.00);
        // untuk menampilkan hasilnya
        System.out.println("Nama        : " + yanto.getNama());
        System.out.println("Gaji Pokok  : " + yanto.getGajiPokok());
        System.out.println("Tunjangan   : " + yanto.getTunjangan());
    }
}


