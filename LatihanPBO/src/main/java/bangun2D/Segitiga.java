/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun2D;

/**
 *
 * @author Sivern
 */
public  abstract class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public  double getLuas(){
        return alas*tinggi/2;
    }
    
    public abstract double getKeliling();
    
    @Override
    public String toString() {
        return "Segitiga{" + "alas=" + alas + ", tinggi=" + tinggi + '}';
    }


}
