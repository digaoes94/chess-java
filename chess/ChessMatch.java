package chess;

import boardgame.Board;
import chess.pieces.*;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		this.board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for (int a = 0; a < board.getRows(); a++) {
			for (int b = 0; b < board.getColumns(); b++) {
				mat[a][b] = (ChessPiece) board.piece(a, b);
			}
		}
		
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.BLACK));
	}
}
