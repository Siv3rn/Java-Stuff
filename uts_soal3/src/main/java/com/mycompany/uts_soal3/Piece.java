/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_soal3;

/**
 *
 * @author Sivern
 */
public class Piece {
    String color;
    int currx;
    int curry;
    String type;
    Position Pos;
    
    
    public Piece(String color, int currx, int curry, String type){
        this.color = color;
        this.type = type;
        this.Pos = new Position(currx,curry);
    
}
    
}
