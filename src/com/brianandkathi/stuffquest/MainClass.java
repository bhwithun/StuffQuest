package com.brianandkathi.stuffquest;

import com.brianandkathi.sqcore.GameData;

public class MainClass {

	public static void main(String[] args) {

		GameData database = new GameData();
		database.connect("game.db");
		
		database.LoadGrid("Beregost");
		/*
		Grid beregost = new Grid("Beregost");
		
		Grid feldpostsinn = new Grid("Feldpost's Inn");

		Portal beregost_to_feldpostsinn 
		  = new Portal(beregost,new Position(0.15,0.6),feldpostsinn,new Position(0.5,0));
		
		Portal feldpostsinn_to_beregost
		  = new Portal(feldpostsinn,new Position(0.5,0),beregost,new Position(0.15,0.6));
		
		World world = new World("The Sword Coast");
		
		world.add(beregost,new Position(0.3,0.7));
		*/
		
	}

}
