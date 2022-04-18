/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess;

/**
 *
 * @author Sivern
 */
public class Pawn extends Piece {
    
public Pawn(String color, int currx, int curry){
        super(color, currx, curry);

    }

   public void move(){
       this.setPosy(this.getPosy()+1);
   }

    public String toString(){
        return "Pawn";
    }
}
