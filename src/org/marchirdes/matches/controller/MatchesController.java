package org.marchirdes.matches.controller;

import org.marchirdes.matches.model.MatchesModel;
import org.marchirdes.matches.view.MatchesView;

/**
 * Main Controller of the game
 * @author mhirdes
 */

public class MatchesController {
    private MatchesModel _model;
    private MatchesView _view;
    private PlayerController[] _players;
    
    private int numberOfPlayers = 2;
    
    public MatchesController() {
        this._model = new MatchesModel();
        this._view = new MatchesView();
        this._players = new PlayerController[numberOfPlayers];
        this._players[0] = new HumanController();
        this._players[1] = new ComputerController();
    }
    
    /**
     * the main controller function
     */
    public void play() {
    	while(true) {
    		startNewGame();
    		
    		// Set the first player and number of matches
    		PlayerController player = this._players[this.getIndexOfFirstPlayer()];
    		this._model.setNumberOfMatches(player.setFirstNumberOfMatches());
    		this._view.printNumberOfMatches(this._model.getNumberOfMatches());
			
    		// Take Matches 
    		int currentPlayerIndex = 0;
			while(_model.getNumberOfMatches() > 1) {
				currentPlayerIndex = setNextPlayerIndex(currentPlayerIndex);
				player = _players[currentPlayerIndex];
				int takeMatches = player.takeMatches(_model.getNumberOfMatches());
				this._model.takeMatches(takeMatches);
				this._view.printTakenMatches(takeMatches);
				this._view.printNumberOfMatches(this._model.getNumberOfMatches());
			}
			
			// Print the Winner
			this._view.printWinner(player.getName());
		}
    }
    
    /**
     * Ask the user to start a new game or abort
     */
    private void startNewGame() {
    	this._view.printStartNewGame();
    	while(true) {
			String answer = this._view.getNextCharacter();
			if(answer.equalsIgnoreCase("j")) {
				return;
			}
			if(answer.equalsIgnoreCase("n")) {
				System.exit(0);
			}
			this._view.printErrorStartNewGame();
		}
    }
    
    /**
     * Ask the user for the index of the first player
     * @return index of player
     */
    private int getIndexOfFirstPlayer() {
    	int counter = 1;
    	for(PlayerController player: _players) {
    		this._view.printPlayer(counter++, player.getName());
    	}
    	
    	this._view.printGetFirstPlayer();
		while(true) {
			int answer = _view.getNumber();
			if(answer < 3) {
				return answer - 1;
			}
			this._view.printErrorGetFirstPlayer(this.numberOfPlayers);
		}
    }
    
    /**
     * during the game toggle players
     * @param old index
     * @return the new index
     */
    private int setNextPlayerIndex(int oldIndex) {
    	int newIndex = ++oldIndex;
    	if(newIndex >= numberOfPlayers) {
    		newIndex = 0;
    	}
    	return newIndex;
    }
}
