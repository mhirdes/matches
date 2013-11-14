package org.marchirdes.matches.model;

/**
 * Model of the Player "computer"
 * @author mhirdes
 */

public class ComputerModel implements PlayerModel {
	private String _name;
	
	public ComputerModel() {
		this._name = "Computer";
	}

	public String getName() {
		return _name;
	}
}
