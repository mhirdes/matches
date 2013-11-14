package org.marchirdes.matches.view;

/**
 * The View of the player Human
 * @author mhirdes
 */

public class HumanView extends MatchesView {
	
	public void printGetFirstNumberOfMatches() {
		System.out.println("Geben Sie die Anzahl der Streichhölzer an.");
	}
	
	public void printErrorFirstNumberOfMatches(int maxMatches) {
		System.out.println("Bitte geben Sie eine Zahl kleiner " + maxMatches + " ein.");
	}
	
	public void printTakeMatches() {
		System.out.println("Wieviele Streichhölzer möchten Sie ziehen?");
	}
	
	public void printErrorTakeMatches(int minMatches, int maxMatches) {
		System.out.println("Sie können nur " + minMatches  + " bis " + maxMatches + " Streichh�lzer ziehen");
	}
}
