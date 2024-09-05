/**
 * @term Summer 2024
 * @course COMP 249
 * @section CC
 * @title Assignment 2 
 * @author Siguang Zhao (27827709) 
 * @date 2024.08.03
 * @Program: Implementing Othello - UnplayablePosition class
 */

public class UnplayablePosition extends Position {
	
	static final char UNPLAYABLE ='*';
	
	// Constructor initializing the position as unplayable
	public UnplayablePosition() {
		super.SetPiece(UNPLAYABLE);
	}
	
	@Override
	public boolean canPlay() {
		
		// Unplayable positions can never be played
		return false;
	}

}
