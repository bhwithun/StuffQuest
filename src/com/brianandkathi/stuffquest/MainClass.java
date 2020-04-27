package com.brianandkathi.stuffquest;

import com.brianandkathi.sqcore.Grid;
import com.brianandkathi.sqcore.SQID;

public class MainClass {

	public static void main(String[] args) {

		SQID.connect("game.db");
		
		Grid nashkel = SQID.loadGrid("Nashkel");
		nashkel.loadGameObjects();
		nashkel.dump();

		Grid beregost = SQID.loadGrid("Beregost");
		beregost.loadGameObjects();
		beregost.dump();
	}

}
