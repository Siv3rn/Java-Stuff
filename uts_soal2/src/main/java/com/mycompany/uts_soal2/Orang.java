/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_soal2;

/**
 *
 * @author Sivern
 */
public class Orang {

    /**
     * @return the NIK
     */

    public String nama;
    private final String NIK;
    char KK;
    char lastDigit;

    public Orang(String nama, String NIK){
        this.nama = nama;
        this.NIK = NIK;
        this.lastDigit = NIK.charAt(NIK.length() - 1);
        this.KK = NIK.charAt(2);
    }
    public String getStatus(){
        if('0' == lastDigit){
            return"Kepala keluarga";
        }
        else if ('1' == lastDigit){
            return"Istri";
        }
        else if ('2' == lastDigit){
            return"Anak";
        }

        return "0";
    }
    public String getRelation(Orang orang){
        
        if(KK == orang.KK){
            return nama + ": " + getStatus() + "\n" +
                   orang.nama + ": " + orang.getStatus() + "\n" + "===================";
        }
        else if (KK != orang.KK){
            return nama + " dan " + orang.nama + " tidak ada hubungan" + "\n" + "===================";
        }

        return"0";
    }
}
