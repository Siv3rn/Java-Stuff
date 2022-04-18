/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess;

/**
 *
 * @author Sivern
 */
public class Piece {
    String color;
    int currx;
    int curry;    
    
    public Piece(String color, int x, int y){
        this.color = color;
        this.currx = 0;
        this.curry = 0;
        this.setPos(x,y);
}
    public void setPosx(int x){
        setPos(x,this.curry);
    }
    public void setPosy(int y){
        setPos(this.currx,y);
    }
        public boolean setPos(int x, int y){
        if(1 <= x && x <= 8 && 1 <= y && y <= 8){
            this.currx = x;
            this.curry = y;
            return true;
        }
        else{
            return false;
        }
        }
    public int getPosx(){
        return this.currx;
    
    }
    public int getPosy(){
        return this.curry;
    
    }
    public String toString(){
        return "Piece";
    }
}