package org.marchirdes.matches.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.marchirdes.matches.controller.ComputerController;

public class ComputerControllerTest extends ComputerController {
	
	@Test
	public void setFirstNumerOfMatchesTest() {
		int ergebnis = setFirstNumberOfMatches();
		assertTrue(ergebnis % GOOD_VALUE == 1);
	}
	
	@Test
	public void takeMatchesTest() {
		int numberOfMatches = 30; // Bad Value
		int expected = 1; // take one to 29
		numberOfMatches = takeMatches(numberOfMatches);
		
		assertEquals(numberOfMatches ,expected);
		
		numberOfMatches = takeMatches(numberOfMatches);
		//By good value return 1 to 3
		assertEquals(numberOfMatches,1,3); // Good Value
	}

}
