/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personel;

/**
 *
 * @author User
 */
public class MahasiswaBeraksi {
    public static void main(String[] args){
        // Membuat Objek
        Mahasiswa anton = new Mahasiswa();
        Mahasiswa riko = new Mahasiswa();
        
        /* memanggil atribut dan memberi nilai */
        
        // Mahasiswa1
        anton.nim = "10102020";
        anton.nama = "Anton Santoso";
        anton.jenisKelamin = "Laki-laki";
        anton.umur = 28;
        anton.alamat = "Bekasi Kota";
        anton.jurusan = "Informatika";
        
        anton.cetakInfo();
        
        // Mahasiswa2
        riko.nim = "20202020";
        riko.nama = "Riko Sanjaya";
        riko.jenisKelamin = "Laki-laki";
        riko.umur = 23;
        riko.alamat = "Cikarang Selatan";
        riko.jurusan = "Tata Boga";
        
        riko.cetakInfo();
        
        
    }
}
    

