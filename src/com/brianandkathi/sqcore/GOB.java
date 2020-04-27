package com.brianandkathi.sqcore;

/**
 * GOB - Game OBject
 * <p>
 * Something that can be placed on a Grid at an X and Y coordinate.
 * <p>
 * The X and Y coordinates are real numbers between 0 and 1 that
 * represent the position on its Grid.
 * 
 * @see Grid
 * @author brian
 *
 */
public abstract class GOB extends SQID {

	protected String description;
	protected Grid grid;
	protected Position position;
	
	public GOB(String description, Grid grid, Position position) {
		super();
		this.description = description; 
		this.position = position;
		this.grid = grid;
	}
	
	@Override
	public void dump() {
		echo( description + " is at " + position.toString() + " in " + grid.toString());
	}

	@Override
	public String toString() {
		String s =description;
		if(position!=null) {
			s += " at "+position.toString();
		}
		return s;
	}

}
