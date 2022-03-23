/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;
import java.time.LocalDate;
/**
 *
 * @author Sivern
 */
public class Main {
    
    public static void main(String[]args){
        
        LocalDate tanggal = LocalDate.now();
        LocalDate tanggal2 = LocalDate.of(2020,1,23);
        COD depo1 = new COD("123", 50,tanggal);
    
        System.out.println(depo1);
    }
    
}
