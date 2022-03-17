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
public class Report {
    Student [] arrayStudent;
    int jumlahStudent;
    int [] arrayRank;
    Subject [] arraySubject;
    int jumlahSubject;
    Report(){
        arrayStudent = new Student [1000]; 
        jumlahStudent = 0;
        arraySubject = new Subject [1000];
        jumlahSubject = 0;
        
    }
    
    

    void addSiswa(Student siswa){
        int n = jumlahStudent;
        arrayStudent[n] = siswa;
        jumlahStudent = jumlahStudent+1;
        
    }
    void addSubject(Subject mapel){
        int n = jumlahSubject;
        arraySubject[n] = mapel;
        jumlahSubject = jumlahSubject+1;
    }
    void rank(){
        int n = jumlahStudent;
        int x = jumlahSubject;
        arrayRank = new int [n];
        for(int i =0; i < x; i++){
            arrayRank[i] = arraySubject[i].total;
        }
        Arrays.sort(arrayRank);
        for(int i = 0; i < x; i++){
           for (int j = 0; j < x; j++){
                if (arrayRank[i] == arraySubject[j].total){
                arrayStudent[j].ranking = x - i;
            }
           }
        }
    }
    String search(String nama){
        int n = jumlahStudent;
        for(int i = 0; i < n; i++){
            if (arrayStudent[i].nama.equals(nama)){
                System.out.println("Nama Siswa/Siswi = " + arrayStudent[i].nama);
                System.out.println("Nomor Induk = " + arrayStudent[i].num);
                System.out.println("Jumlah Nilai = " + arraySubject[i].total);
                System.out.println("Ranking = " + arrayStudent[i].ranking);
            }
                    }
        return "0";
    }
}
