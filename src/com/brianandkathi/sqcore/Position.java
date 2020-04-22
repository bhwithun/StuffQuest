/**
 * 
 */
package com.brianandkathi.sqcore;

/**
 * Position - a 2D Location on a Grid
 * 
 * @author brian
 *
 */
public class Position {

	private double xcoord;
	private double ycoord;
	
	/**
	 * 
	 * @param x Horizontal placement on a Grid [0..1]
	 * @param y Vertical placement on a Grid [0..1]
	 */
	public Position(double x, double y) {
		xcoord = x;
		ycoord = y;
	}
	
	/**
	 * Copy Constructor
	 * 
	 * @param position
	 */
	public Position(Position position) {
		this.xcoord = position.xcoord;
		this.ycoord = position.ycoord;
	}
	
	@Override
	public String toString() {
		return "("+String.format("%.3f", xcoord) +","+String.format("%.3f", ycoord)+")";
	}

}
