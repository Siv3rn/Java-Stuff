/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_soal3;

/**
 *
 * @author Sivern
 */
public class Pawn extends Piece {
    boolean maju_sekali;
    
public Pawn(String color, int currx, int curry, String type){
        super(color, currx, curry, type);

    }

   public void move(int eks, int yea){
       if(eks == Pos.x && yea == Pos.y+1){
       Pos.y = yea;       
       }
       else{
           Pos.y = 0;
       }
   }
    public Position getPos(){
        return this.Pos;
    }

}


