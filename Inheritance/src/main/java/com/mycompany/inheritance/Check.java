/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author Sivern
 */
class Check extends Bank{
    double limit;
    

    public Check(double balance, String acc, double limit){
        super(balance, acc);

        this.limit = limit;

    }
        public String toString(){
        return "balance:" + this.balance + "\n" + this.acc + "\n" + "limit:" + limit;
    }
}
