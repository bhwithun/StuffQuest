/**
 * 
 */
package com.brianandkathi.sqcore;

import com.brianandkathi.stuffquest.World;

/**
 * Grid - a rectangular patch of ground whose coordinates range from (0,0) to (1,1).
 * The Grid is a container and it can hold Game Objects.  These objects will have a
 * precise location (Coordinate) on the grid.
 * 
 * @see GOB Game Object
 * 
 * @author brian
 *
 */
public class Grid extends Place {

	private String description;
	private Place place;
	private Position position;
	
	public Grid(Place place, String description, Position position) {
		super();
		this.place = place;
		this.description = description;
		this.position = new Position(position);
	}
	
	@Override
	public String toString() {
		return description;
	}
	
	@Override
	public void dump() {
		echo(description+" [grid_"+sqid+"]");
		echo(description+" is in "+place.toString()+" at "+position.toString());
	}

}
