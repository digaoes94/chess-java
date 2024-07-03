package main;

import chess.ChessMatch;

public class MainChess {

    public static void main(String[] args) {
    	
    	ChessMatch match = new ChessMatch();
    	UI.printBoard(match.getPieces());
    	
    }
}