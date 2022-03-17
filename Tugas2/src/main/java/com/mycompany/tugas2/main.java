/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas2;

import java.util.Arrays;

/**
 *
 * @author Sivern
 */
public class main {
    public static void main(String[]args){
        Student S1 = new Student ("ari", "S01");
        Subject N1 = new Subject (80,60);
        Student S2 = new Student ("ado", "S02");
        Subject N2 = new Subject (100,90);
        Student S3 = new Student ("boy", "S03");
        Subject N3 = new Subject (60,50);
        Student S4 = new Student ("cen", "S04");
        Subject N4 = new Subject (80,80);

        
        Report rapor = new Report();
        
        rapor.addSiswa(S1);
        rapor.addSubject(N1);
        
        rapor.addSiswa(S2);
        rapor.addSubject(N2);
        
        rapor.addSiswa(S3);
        rapor.addSubject(N3);
        
        rapor.addSiswa(S4);
        rapor.addSubject(N4);
        
        rapor.rank();


        
        
        rapor.search("ari");
        System.out.println("------------------------");
        rapor.search("ado");
        
    }
    
}
