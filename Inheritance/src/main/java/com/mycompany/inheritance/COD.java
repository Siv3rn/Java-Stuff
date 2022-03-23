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
class COD extends Bank {
    LocalDate expiry;
    
    public COD(String acc, double balance, LocalDate expiry){
    super(balance, acc);

    this.expiry = expiry;
        
    
}
    public String toString(){
        return "balance:" + this.balance + "\n" + this.acc + "\n" + "expired:" + expiry;
    }
}