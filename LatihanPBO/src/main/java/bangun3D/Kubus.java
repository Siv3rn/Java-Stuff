/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun3D;
import bangun2D.Persegi;
/**
 *
 * @author Sivern
 */
public class Kubus extends Persegi{

    public Kubus(double sisi) {
        super(sisi);
    }
    @Override
    public double getLuas(){
        return 6 * super.getLuas();
    }
    
    @Override
    public double getKeliling(){
        return 12 * super.getSisi();
    }
    
    public double getAlas(){
        return super.getLuas();
    }
    
    public double getVolume(){
        return super.getLuas() * getSisi();
    }
    
    @Override
    public String toString(){
        return "Balok{" + "sisi=" + getSisi() + '}';
    }
}
