/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_soal3;

/**
 *
 * @author Sivern
 */
public class Knight extends Piece {

    public Knight(String color, int currx, int curry, String type){
        super(color, currx, curry, type);
    }
    public void move(int eks, int yea){
        if(yea == Pos.y+2 && eks == Pos.x + 1){
            Pos.y = yea;
            Pos.x = eks;
        }
        else if(yea == Pos.y+2 && eks == Pos.x - 1){
            Pos.y = yea;
            Pos.x = eks;
        }
        else{
            Pos.y = 0;
            Pos.x = 0;
        }
    }
    public Position getPos(){
        return this.Pos;
    }
}
