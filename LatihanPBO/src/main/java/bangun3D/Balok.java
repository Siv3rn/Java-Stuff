/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun3D;
import bangun2D.PersegiPanjang;

/**
 *
 * @author Sivern
 */
public class Balok extends PersegiPanjang{
    private double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double getLuas(){
        return 2 * (getPanjang()* getLebar() + getPanjang() * tinggi + getLebar() * tinggi);
    }
    
    @Override
    public double getKeliling(){
        return 4*(getPanjang() + getLebar() * tinggi);
    }
    
    public double getVolume(){
        return super.getLuas() * tinggi;
    }
    
    @Override
    public String toString(){
        return "Balok{"  + "panjang=" + getPanjang()  + "lebar" + getLebar()  + "tinggi" + tinggi + '}';
    
}
}
