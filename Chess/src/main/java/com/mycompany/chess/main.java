package com.mycompany.chess;

/**
 *
 * @author Sivern
 */
public class main {
    public static void main (String [] args){
        Game papan1 = new Game();
        Piece Pion = new Pawn("white", 4,5);
        
        papan1.addPiece(Pion);
        
        
        papan1.printBoard();
        System.out.println("--------------------");
        
        papan1.movePiece(Pion, 5,5);
        papan1.printBoard();
    }
}
