/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun2D;

import master.Matematika;

/**
 *
 * @author Sivern
 */
public class SegitigaSamaSisi extends Segitiga{
    
    public SegitigaSamaSisi(double sisi){
        super(sisi, 0);
        super.setTinggi(getTinggi());
    }

    @Override
    public double getTinggi(){

       return Matematika.getLurus(getAlas(), getAlas()/2);
    }
    
    
    @Override
    public void setTinggi(double tinggi){
        double alasBaru = Math.sqrt((4.0/3) * tinggi * tinggi);
        setAlas(alasBaru);
    }

    @Override
    public double getKeliling(){
        return 3 * getAlas();
    }
}
