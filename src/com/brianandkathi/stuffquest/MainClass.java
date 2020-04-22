package com.brianandkathi.stuffquest;

import com.brianandkathi.sqcore.Database;
import com.brianandkathi.sqcore.Grid;
import com.brianandkathi.sqcore.Position;

public class MainClass {

	public static void main(String[] args) {

		Database database = new Database();
		database.connect("game.db");
		
		World world = new World("The Sword Coast");
		world.dump();
		
		Grid beregost = new Grid(world,"Beregost",new Position(0.1,0.1));
		beregost.dump();
		
		Grid feldpostsinn = new Grid(beregost,"Feldpost's Inn",new Position(0.2,0.75));
		feldpostsinn.dump();
		
	}

}
