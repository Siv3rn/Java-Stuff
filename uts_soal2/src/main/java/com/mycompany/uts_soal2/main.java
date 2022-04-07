/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_soal2;

/**
 *
 * @author Sivern
 */
public class main {
    public static void main (String [] args){
        Orang a = new Orang("Ayah Fikri", "KK1123_12345_0");
        Orang b = new Orang("Fikri",      "KK1123_12346_2");
        Orang c = new Orang("Ayah Santi", "KK2123_12347_0");
        Orang d = new Orang("Santi",      "KK2123_12348_2");
        Orang e = new Orang("Adik Santi", "KK2123_12349_2");
        
        
        
    

       System.out.println(a.getRelation(b));
       System.out.println(a.getRelation(c));
       System.out.println(b.getRelation(d));
       System.out.println(d.getRelation(e));
    }
}
