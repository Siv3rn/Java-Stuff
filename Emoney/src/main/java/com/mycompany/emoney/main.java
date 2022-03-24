/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emoney;

/**
 *
 * @author Sivern
 */
public class main {
    public static void main(String[]args){
        Boc money1 = new Boc(10, "Flazzy");
        Bog money2 = new Bog(20, "Opalo");


        money1.topup(10000);
        money1.pay(1000);
        

        money2.topup(10000,true);
        money2.pay(1000);

        System.out.println(money1.balance);

        System.out.println("-----------------");

        System.out.println(money2.balance);

    }
    
}
