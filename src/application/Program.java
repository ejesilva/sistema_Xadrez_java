package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.chessException;
import chess.chessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Source: ");
				chessPosition source = UI.reacChessPosition(sc);
				
				System.out.println();
				System.out.print("Target: ");
				chessPosition target = UI.reacChessPosition(sc);
				
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		
			}
			catch(chessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			}
		
	}

}
