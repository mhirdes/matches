package org.marchirdes.matches.model;

/**
 * The Model of the Matches Game 
 * @author mhirdes
 */

public class MatchesModel {
	private int numberOfMatches;
	private int currentPlayer;

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public int getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(int currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
	
	public void takeMatches(int tokenMatches) {
		this.numberOfMatches -= tokenMatches;
	}
}
