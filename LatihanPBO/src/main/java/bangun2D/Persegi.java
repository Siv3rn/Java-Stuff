/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun2D;

/**
 *
 * @author Sivern
 */
public class Persegi {
    
    private double sisi;
    
    
    public Persegi(double sisi){
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public double getLuas(){
        return sisi*sisi;
    }
    public double getKeliling(){
        return 4*sisi;
    }
    @Override
    public String toString(){
        return "Persegi{" + "sisi = " + sisi + '}';
    }
}
