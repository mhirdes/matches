package org.marchirdes.matches.view;

import java.util.Scanner;

/**
 * The Main View of the matches game
 * @author mhirdes
 */

public class MatchesView {
	protected final Scanner scanner = new Scanner(System.in);

    public String getNextCharacter() {
		return scanner.next();
	}
    
    public int getNumber() {
		String input = scanner.nextLine();
    	try {
    		return Integer.parseInt(input);
    	} catch(NumberFormatException exception) {
    		System.out.println("Bitte geben Sie eine Zahl ein!");
    		return getNumber();
    	}
	}
    
    public void printStartNewGame() {
    	System.out.println("Möchten Sie ein neues Spiel starten (J/N)?");
    }
    
    public void printPlayer(int index, String name) {
		System.out.println(index + ": " + name);
	}
    
    public void printErrorStartNewGame() {
    	System.out.println("Bitte geben Sie ein J für Ja oder ein N für Nein ein!");
    }
    
    public void printGetFirstPlayer() {
    	System.out.println("Welcher Spieler soll beginnen?");
    }
    
    public void printErrorGetFirstPlayer(int maxIndex) {
    	System.out.println("Bitte geben Sie eine Zahl =< " + maxIndex + " ein!");
    }
    
    public void printTakenMatches(int takenMatches) {
    	System.out.println("Gezogene Streichhölzer: " + takenMatches);
    }
    
    public void printNumberOfMatches(int numberOfMatches) {
    	System.out.println("Anzahl der Streichhölzer: " + numberOfMatches);
    }
    
    public void printWinner(String winner) {
    	System.out.println(winner + " hat gewonnen");
    }
}

