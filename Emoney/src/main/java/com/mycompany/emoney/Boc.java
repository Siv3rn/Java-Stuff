/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emoney;

/**
 *
 * @author Sivern
 */
public class Boc extends Emoney{
    public Boc(int id, String edition){
        super(id, edition);

    
    }
    public void topup(int amount){
        balance = balance + (amount+amount/10);
    }
    public void pay(int amount) {
        balance = balance - amount;
    }
}
