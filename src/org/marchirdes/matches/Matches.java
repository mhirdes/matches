package org.marchirdes.matches;

import org.marchirdes.matches.controller.MatchesController;

/**
 * Main class initializes the controller and starts the game
 * @author mhirdes
 */

public class Matches {	
	public static void main(String[] args) {
		MatchesController controller = new MatchesController();
		controller.play();
	}
}
