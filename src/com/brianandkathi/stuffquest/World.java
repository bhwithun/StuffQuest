/**
 * 
 */
package com.brianandkathi.stuffquest;

import com.brianandkathi.sqcore.Grid;
import com.brianandkathi.sqcore.Position;
import com.brianandkathi.sqcore.SQID;

/**
 * World - connects all the places you can go.
 * <p>
 * A World connects Grids together
 * 
 * @see Grid
 * 
 * @author brian
 *
 */
public class World extends SQID {

	private String description;

	public World(String description) {
		this.description = description;
		dump();
	}
	
	@Override
	public String toString() {
		return description;
	}
	
	@Override
	public void dump() {
		echo(description+" [world_"+sqid+"]");
	}

	public void add(Grid grid, Position position) {
		echo(grid.toString()+" is on "+description+" at "+position.toString());
	}

}
