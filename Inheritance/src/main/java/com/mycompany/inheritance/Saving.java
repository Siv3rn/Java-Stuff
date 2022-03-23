/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author Sivern
 */
public class Saving extends Bank{
    int transfer;
    
    public Saving(double balance, String acc,int transfer) {
        super(balance, acc);
        this.transfer = transfer;
    
    
    
    }
    public String toString(){
        return "balance:" + this.balance + "\n" + this.acc + "\n" + "jumlah transfer" + transfer;
        
}
}
