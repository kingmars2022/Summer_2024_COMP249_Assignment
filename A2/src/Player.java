/**
 * @term Summer 2024
 * @course COMP 249
 * @section CC
 * @title Assignment 2 
 * @author Siguang Zhao (27827709)
 * @date 2024.08.03
 * @Program: Implementing Othello - Player class
 */

public class Player {
	
	private String playerName;
	private char color;
	
	public Player() {
		playerName = "DefaultPlayerName";
		color= 'B';
	}
	
	public Player(String name) {
		playerName = name;
		color= 'B';
	}
	
	public void Setname(String name) {
		playerName = name;
	}
	
	public String GetName() {
		return playerName;
	}
	
	// Check if two players are equal based on their names
	public boolean equals(Player other) {
		
		if(other.GetName()==playerName) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public char GetColor() {
		return color;
	}
	
	public void SetColar(char wOrB) {
		color = wOrB;
	}
}
