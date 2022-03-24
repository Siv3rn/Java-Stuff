/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emoney;

/**
 *
 * @author Sivern
 */
public class Emoney {
    int id;
    int balance;
    String edition;

    public Emoney(int id, String edition){
        this.id = id;
        balance = 0;
        this.edition = edition;
    }
    
    public void topup(int amount){
        balance = balance + amount;
    }
    public void pay(int amount){
        balance = balance - amount;
    }
    
}
