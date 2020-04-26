/**
 * 
 */
package com.brianandkathi.sqcore;

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
public class Grid extends SQID {

	private String description;
	
	public Grid(String description, String uuid) {
		super(uuid);
		this.description = description;
		dump();
	}
	
	@Override
	public String toString() {
		return description;
	}
	
	@Override
	public void dump() {
		echo(description+" [grid_"+sqid+"]");
	}
	
	public void add_entrance(Portal portal) {
		if(portal.exit()==null) {
			echo(toString()+" has a Portal out at "+portal.entranceCoordinates());
		} else {
			echo(toString()+" has a Portal to "+portal.exit().toString());
		}
	}
	
	public void add_exit(Portal portal) {
		echo(toString()+" has a Portal from "+portal.entrance().toString());
	}

}
