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
public class Lingkaran {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public Lingkaran(double r){
    this.r = r;
}
    
    public double getLuas(){
        return Matematika.phi*r*r;
    }
    public double getKeliling(){
        return 2*Matematika.phi*r;
    
    }
    @Override
    public String toString(){
        return "Lingkaran{" + "r=" + r + '}' ;
    }
}
