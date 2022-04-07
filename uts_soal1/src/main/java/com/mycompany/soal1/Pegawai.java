/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soal1;

/**
 *
 * @author Sivern
 */
public class Pegawai {
    String nama;
    String divisi;
    String posisi;
    
    
    public Pegawai(String nama, String divisi, String posisi){
        this.nama = nama;
        this.divisi = divisi;
        this.posisi = posisi;
    }
    float gaji(){
        if("Front-end".equals(divisi) && "intern".equals(posisi)){
            return 600000;
        }
        else if("Front-end".equals(divisi) && "programmer".equals(posisi)){
            return 3000000;
        }
        else if("Back-end".equals(divisi) && "intern".equals(posisi)){
            return 750000;
        }
        else if("Back-end".equals(divisi) && "programmer".equals(posisi)){
            return 4000000;
        }

        return 0;
    }
        public String toString(){
        return "Nama: " + nama + "\n" +
        "Divisi: " + divisi + "\n" + 
        "Posisi: " + posisi + "\n" + 
        "Gaji: " + "Rp " +gaji() +"\n" + 
        "=============================";
                
        
    }
}
