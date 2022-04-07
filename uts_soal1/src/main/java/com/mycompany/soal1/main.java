/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soal1;
import java.util.Scanner;
/**
 *
 * @author Sivern
 */
public class main {
    public static void main(String[]args){
        Scanner myObj = new Scanner(System.in);
        Pegawai a = new Pegawai("Rayendra","Back-end","intern");
        Pegawai b = new Pegawai("Rahul","Back-end","programmer");           
        Pegawai c = new Pegawai("Niki","Front-end","intern");
        Pegawai d = new Pegawai("Yahya","Back-end","programmer");

        System.out.println("Masukkan nama");
        String username = myObj.nextLine();
        System.out.println("Masukkan Divisi");
        String division = myObj.nextLine();
        System.out.println("Masukkan Posisi");
        String position = myObj.nextLine();
        
        Pegawai e = new Pegawai(username, division, position);
        
        System.out.println("=====Daftar gaji pegawai=====");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
