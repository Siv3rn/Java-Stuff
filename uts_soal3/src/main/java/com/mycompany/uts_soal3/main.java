/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_soal3;

/**
 *
 * @author Sivern
 */
public class main {
    public static void main(String[]args){
        Game game1 = new Game(0,0);
        Pawn bidak1 = new Pawn("white", 5, 2, "pawn");
        Knight kuda1 = new Knight("white", 7,1,"Knight");
        Pawn bidak2 = new Pawn("white", 4, 2, "pawn");
        Knight kuda2 = new Knight("white", 2,1,"Knight");

        //putih
        bidak1.move(5,3);
        System.out.println(bidak1.getPos());
        System.out.println("==============");
        kuda1.move(6, 3);
        System.out.println(kuda1.getPos());

        System.out.println("xxxxxxxxxxxxxxxx");

        bidak2.move(4,3);
        System.out.println(bidak2.getPos());
        System.out.println("==============");
        kuda2.move(3, 3);
        System.out.println(kuda2.getPos());
        
        
        
    }
}
