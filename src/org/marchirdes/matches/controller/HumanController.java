package org.marchirdes.matches.controller;

import org.marchirdes.matches.model.HumanModel;
import org.marchirdes.matches.view.HumanView;

/**
 * The Controler for the Player Human
 * @author mhirdes
 */

public class HumanController extends PlayerController {
    private HumanView _view;
    private HumanModel _model;
    
    public HumanController() {
        this._view = new HumanView();
        this._model = new HumanModel();
    }
	
	@Override
	public int setFirstNumberOfMatches() {
		_view.printGetFirstNumberOfMatches();
		int eingabe = _view.getNumber();
		if(eingabe >= MIN_MATCHES_PER_TURN && eingabe <= MAX_MATCHES) {
			return eingabe;
		} else {
			_view.printErrorFirstNumberOfMatches(MAX_MATCHES);
			setFirstNumberOfMatches();
		}
		return 0;
	}

	@Override
	public int takeMatches(int matches) {
		int take = 0;
		_view.printTakeMatches();
		while (true) {
			take = _view.getNumber();
			int max = MAX_MATCHES_PER_TURN;
			if(matches < MAX_MATCHES_PER_TURN) {
				max = matches;
			}
			if (take >= MIN_MATCHES_PER_TURN 
					&& take <= max) {
				break;
			}
			_view.printErrorTakeMatches(MIN_MATCHES_PER_TURN, max);
		}
		return take;
	}

	public String getName() {
		return _model.getName();
	}
}