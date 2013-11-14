package org.marchirdes.matches.controller;

import org.marchirdes.matches.model.ComputerModel;

/**
 * The Controler for the Player Computer
 * The Computer tries to make the number of matches
 * to modulo (MAX_NUMBER_PER_TURN + 1) == 1 
 * @author mhirdes
 */

public class ComputerController extends PlayerController {
	private ComputerModel _model;
	
	public ComputerController() {
		this._model = new ComputerModel();
	}
	
	// This is for calculation
	public final int GOOD_VALUE = MAX_MATCHES_PER_TURN + 1;
	
	@Override
	public int setFirstNumberOfMatches() {
		int firstNumber = 0;
		while(true) {
			firstNumber = this.getRandomNumber(this.GOOD_VALUE, MAX_MATCHES);
			if(this.isGoodNumber(firstNumber)) {
				break;
			}
		}
		return firstNumber;
	}

	@Override
	public int takeMatches(int numberOfMatches) {
		int maxMatchesForThisTurn = MAX_MATCHES_PER_TURN;
		if(numberOfMatches <= MAX_MATCHES_PER_TURN) {
			maxMatchesForThisTurn = numberOfMatches - MIN_MATCHES_PER_TURN;
		}
		
		// try make number of matches a good number of matches for computer
		if(this.isGoodNumber(numberOfMatches)) {
			return this.getRandomNumber(MIN_MATCHES_PER_TURN, maxMatchesForThisTurn);
		} else {
			return --numberOfMatches % this.GOOD_VALUE;
		}
	}
	
	public String getName() {
		return _model.getName();
	}
	
	/**
	 * @param min
	 * @param max
	 * @return random number beetween min and max
	 */
	private int getRandomNumber(int min, int max) {
		return (int) (Math.random() * (max-min) + min);
	}
	
	/**
	 * proof if number is ok
	 * @param number
	 * @return bool number is ok
	 */
	private boolean isGoodNumber(int number) {
		return number % this.GOOD_VALUE == 1 ? true:false;
	}
}
