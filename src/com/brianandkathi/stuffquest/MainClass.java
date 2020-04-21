package com.brianandkathi.stuffquest;

import com.brianandkathi.sqcore.GOB;
import com.brianandkathi.sqcore.Grid;
import com.brianandkathi.sqcore.SQID;

public class MainClass {

	public static void main(String[] args) {

		SQID sqid = new SQID();
		sqid.dump();
	
		GOB gob = new GOB();
		gob.dump();
		
		Grid grid = new Grid();
		grid.dump();
		
		World world = new World();
		world.dump();
	}

}
