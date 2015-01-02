/**
 * 2048 (Projet JAVA - L3 Informatique)
 * @author Bryan Lee (blee@etudiant.u-pem.fr)
 * @author Jee Hoon Ahn (jahn01@etudiant.u-pem.fr)
 */

package fr.umlv.projet.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

import fr.umlv.projet.outil.Rng;

@SuppressWarnings("serial")
public class Case extends JPanel {
	private int level;
	private Point casePosition;
	protected static final int CASE_SIZE = 105;
	
	/**
	 * Class constructor
	 */
	public Case() {
		level = 0;
	}
	
	/**
	 * Copy constructor
	 */
	Case(Case c){
		this.level = c.getLevel();
	}
	
	/**
	 * Put a random level in level
	 */
	void start() {
		Rng random = new Rng();
		level = random.getRandomLevel();
	}
	
	public int getLevel(){
		return level;
	}
	
	void setLevel(int level){
		this.level = level;
	}
	
	/**
	 * Double the level
	 */
	void levelUp() {
		level = level *2;
	}
	
	/**
	 * verify if the level in the case is the end number, 2048
	 * @return true if case is 2048
	 */
	boolean isWin(){
		return level == 2048;
	}

	/**
	 * it test if the same value (only level)
	 * @return true if level is equal 
	 */
	boolean isSameValue(Case c) {
		return this.level == c.level;
	}

	/**
	 * if level is 0 return true
	 * @return true if level == 0
	 */
	boolean isZero() {
		return level == 0;
	}

	/**
	 * reset the level to 0
	 */
	void reset() {
		level = 0;
	}
		
	/**
	 * print an integer of level
	 * @return string of level integer 
	 */
	@Override
	public String toString(){
		return Integer.toString(level);
	}
	
	/**
	 * test if the objects and values are same
	 * @return true if objects and values are same
	 */
	@Override
	public boolean equals(Object o) {
    	if(o == this) {
    		return true;
    	}
    	if(o instanceof Case) {
    		Case test = (Case) o;
    		if(this.level == test.level)
    		return true;
    	}
    	return false;
    }

	/* Graphical functions for the Case class *****************************/
	
	public Point getCasePosition() {
		return casePosition;
	}

	public void setCasePosition(Point casePosition) {
		this.casePosition = casePosition;
	}
	
	public void setCasePosition(int x, int y) {
		this.casePosition = new Point(x,y);
	}
	
	public void paintComponent( Graphics g ) {
		switch( getLevel() ) {
		case 0:	g.setColor(new Color(204,192,179));	break;	//Set color of the next drawing
		case 2:	g.setColor(new Color(237,224,200));	break;	
		case 4:	g.setColor(new Color(237,224,200));	break;
		case 8:	g.setColor(new Color(242,177,121)); break;
		case 16: g.setColor(new Color(245,149,99)); break;
		case 32: g.setColor(new Color(246,124,95)); break;
		case 64: g.setColor(new Color(234,89,60)); break;
		case 128: g.setColor(new Color(236,204,112)); break;
		}
		g.fillRect(getCasePosition().x,getCasePosition().y, CASE_SIZE, CASE_SIZE);
		
	}


}
