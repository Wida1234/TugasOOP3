/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personel;

/**
 *
 * @author User
 */
public class Mahasiswa extends Manusia {
    String nim;
    String jurusan;
    
    // Setter
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    
    // Getter
    public String getNim(){
        return this.nim;
    }
    
    public String getJurusan(){
        return this.jurusan;
    }
}
    

