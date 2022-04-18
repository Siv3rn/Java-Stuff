/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chess;

/**
 *
 * @author Sivern
 */
public class Game {
    private Piece [][] board;
    
    
    Game(){
        board = new Piece [8][8];
    }
    public Piece[][] getBoard(){
        return board;
    }
    public boolean addPiece(Piece p){
       if(board[p.getPosx() - 1][p.getPosy() - 1] == null){
          board[p.getPosx() - 1][p.getPosy() - 1] = p;          
          return true;
    }
       else{
               return false;
               }
    }
    public void movePiece(Piece p, int x, int y){
        int oldx = p.getPosx();
        int oldy = p.getPosy();
        
        if(p.setPos(x, y)){
          board[oldx - 1][oldy - 1] = null;
          board[p.getPosx() - 1][p.getPosy() - 1] = p; 
        
        }
    }
public void printBoard() {
        for (int i = 0; i < 8 ; i++ ) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j] + " | ");
                } else {
                    System.out.print("..... | ");
                }
            }
            System.out.println();
        }
    }    
}