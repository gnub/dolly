/**
 * 
 */
package model;

import java.util.Random;

/**
 * @author Julian
 *
 */
public abstract class Generator {
	
	private Random random;
	
	int currentValue = 0;
	
	public void generate(Board board) {
		// TODO: Implement. LAWL.
		// TODO: random tal 0-81 som skal fjernes. f� board til at fjerne, f� l�seren til at l�se, hvis muligt, fjern tal, hvis ikke s�t det tilbage.
		random = new Random(81);
		
		int a = random.nextInt();
		
		// Gets value a from board[] and stores it
		currentValue = board.getValue(a); 

		// removes value a from board[]
		board.setValue(a, 0);
	
	}
}
