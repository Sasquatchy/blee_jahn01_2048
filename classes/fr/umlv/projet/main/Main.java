/**
 * 2048 (Projet JAVA - L3 Informatique)
 * @author Bryan Lee (blee@etudiant.u-pem.fr)
 * @author Jee Hoon Ahn (jahn01@etudiant.u-pem.fr)
 */


package fr.umlv.projet.main;

import fr.umlv.projet.game.Board;
import fr.umlv.projet.graphic.Window;

public class Main {

	public static void main(String[] args) {
		Window win = new Window();
		Board board = new Board();
		System.out.println(board);
		board.startNewCase();
		board.startNewCase();
		board.startNewCase();
		board.startNewCase();
		board.startNewCase();
		board.startNewCase();
		board.startNewCase();
		board.startNewCase();
		board.startNewCase();
		board.startNewCase();
		board.startNewCase();
		board.startNewCase();
		board.startNewCase();
		System.out.println(board);
		//board.moveCaseToLeftLoop();
		//board.moveDown();
		System.out.println(board);
		board.moveUp();
		System.out.println(board);
		win.setContentPane(board);
		win.setVisible(true);
	}

}
