/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package master;

/**
 *
 * @author Sivern
 */
public class Matematika {
    public static final double phi = 22.0/7;
    
    
    public static double getMiring(double a,double b){
        double miring = a*a + b*b;
        return Math.sqrt(miring);
    }
    
    public static double getLurus(double miring,double a){
        double b = miring * miring - a * a;
        return Math.sqrt(b);
    }
}
