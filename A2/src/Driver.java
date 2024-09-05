/**
 * @term Summer 2024
 * @course COMP 249
 * @section CC
 * @title Assignment 2 
 * @author Siguang Zhao (27827709) 
 * @date 2024.08.03
 * @Program: Implementing Othello - Driver class
 */


public class Driver {

	public static void main(String[] args) {
		
		// Create a new game instance
		Game game = new Game();
		
		// Initialize the game settings and start menu
		game.Start();
		
		// Start the gameplay loop
		game.play();
		
	}
}
