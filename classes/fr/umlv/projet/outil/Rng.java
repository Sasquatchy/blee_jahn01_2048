/**
 * 2048 (Projet JAVA - L3 Informatique)
 * @author Bryan Lee (blee@etudiant.u-pem.fr)
 * @author Jee Hoon Ahn (jahn01@etudiant.u-pem.fr)
 */

package fr.umlv.projet.outil;

import java.util.Random;

public class Rng {
	private Random rand;

	/** 
	 * Class constructor.
	 */
	public Rng() {	
		rand = new Random();
	}
	
	/**
	 * @return	2 with 90% chance
	 * @return	4 with 10% chance
	 */
	public int getRandomLevel() {
		if(rand.nextInt(99) < 10){
			return 4;
		}
		return 2;
	}
	
	/**
	 * @return	An random index between 0 and 3 
	 */	
	public int getRandomIndex() {
		return (rand.nextInt(4));
	}
	
	/**
	 * @param 	n	index to be ignored
	 * @return		A random index between 0 and 3, excluding n
	 */		
	public int getRandomIndexExcept(int n) {
		int x;
		do {
			x = this.getRandomIndex();
		} while(x == n);
		return x;
	}
}
