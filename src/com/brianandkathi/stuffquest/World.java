/**
 * 
 */
package com.brianandkathi.stuffquest;

import com.brianandkathi.sqcore.Place;
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
public class World extends Place {

	private String description;

	public World(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return description;
	}
	
	@Override
	public void dump() {
		echo(description+" [world_"+sqid+"]");
	}

}
