/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emoney;

/**
 *
 * @author Sivern
 */
public class Bog extends Emoney {
    public Bog(int id, String edition){
    super(id, edition);

    
    }


    public void topup(int amount, boolean isPromo){
        if(isPromo == false){
            balance = balance + (amount+(amount/20));
        }
        else{
            balance = balance + (amount+(amount/5));
        }
    }
    public void pay(int amount) {
        balance = balance - (amount - (amount/10));    
    }
    
}
