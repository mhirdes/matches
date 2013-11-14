package org.marchirdes.matches.controller;

import org.marchirdes.matches.config;

/**
 * Interface of a player controller
 * @author mhirdes
 */

abstract class PlayerController {
	// maximum numbers of matches in one turn
	public static final int MIN_MATCHES_PER_TURN = 1;
	public static final int MAX_MATCHES_PER_TURN = config.MAX_MATCHES_PER_TURN;
	public static final int MAX_MATCHES = config.MAX_MATCHES;
	
	abstract int setFirstNumberOfMatches();
	abstract int takeMatches(int matches);
	abstract String getName();
}
