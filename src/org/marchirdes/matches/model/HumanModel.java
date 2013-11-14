package org.marchirdes.matches.model;

/**
 * Model of the Player "Human"
 * @author mhirdes
 */

public class HumanModel implements PlayerModel {
	private String _name;
	
	public HumanModel() {
		this._name = "Spieler";
	}

	public String getName() {
		return _name;
	}
}
