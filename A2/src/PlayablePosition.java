/**
 * @term Summer 2024
 * @course COMP 249
 * @section CC
 * @title Assignment 2 
 * @author Siguang Zhao (27827709)
 * @date 2024.08.03
 * @Program: Implementing Othello - PlayablePosition class
 */

public class PlayablePosition extends Position {

	// Constructor initializing the position as empty
	public PlayablePosition() {
		
		super.SetPiece(EMPTY);
	}
	
	@Override
	public boolean canPlay(){
		
		if(super.GetPiece() == EMPTY) {
			return true;//playable
		}
		return false;//otherwise the position is not playable
		
	}
	//public void Play()

}
