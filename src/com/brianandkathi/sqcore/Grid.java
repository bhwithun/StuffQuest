/**
 * 
 */
package com.brianandkathi.sqcore;

/**
 * Grid - a walkable surface.
 * <p>
 * A GOB can be located on a Grid.
 * 
 * @see GOB Game Object
 * 
 * @author brian
 *
 */
public class Grid extends GOB {

	/**
	 * 
	 */
	public Grid() {
		super();
	}
	
	public void dump() {
		super.dump();
		System.out.println("Grid:"+sqid);
	}

}
