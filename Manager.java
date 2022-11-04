/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawai;

/**
 *
 * @author User
 */
public class Manager extends Pegawai{
    private double Tunjangan;
    
    // setter
    public void setTunjangan(double Tunjangan){
        this.Tunjangan = Tunjangan;
    }
    
    // getter
    public double getTunjangan(){
        return this.Tunjangan;
    }
    
    /**
     *
     */
    @Override
    public void cetakInfo(){
        System.out.println("Tunjangan       : " + this.Tunjangan);
    }
    public void cetakTunjangan(){
        System.out.println("Tunjangan       : " + this.Tunjangan);
    }

}

    

