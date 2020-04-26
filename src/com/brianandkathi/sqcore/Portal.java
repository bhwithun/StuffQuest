/**
 * 
 */
package com.brianandkathi.sqcore;

/**
 * @author brian
 *
 */
public class Portal extends SQID {

	protected Grid src;
	protected Grid dest;
	protected Position src_pos;
	protected Position dest_pos;
	
	/**
	 * Constructor using two Grids is used when both Grids are in memory.
	 * 
	 * @param entrance
	 * @param entrance_position
	 * @param exit
	 * @param exit_position
	 */
	public Portal(Grid entrance, Position entrancePosition, Grid exit, Position exitPosition) {
		super();
		src = entrance;
		src_pos = entrancePosition;
		dest = exit;
		dest_pos = exitPosition;
		entrance.add_entrance(this);
		exit.add_exit(this);
	}

	/**
	 * Constructor using one Grid is used when the entrance Grid is in memory, but
	 * the exit grid is not.
	 * 
	 * @param entrance
	 * @param entrancePosition
	 */
	public Portal(Grid entrance, Position entrancePosition) {
		src = entrance;
		src_pos = entrancePosition;
		dest = null;
		dest_pos = null;
		echo("[portal_"+sqid.toString()+"]");
	}
	
	@Override
	public void dump() {
		echo("Portal from "+src.toString()+" to "+dest.toString()+"[portal_"+sqid+"]");
	}

	public String entranceCoordinates() {
		return src_pos.toString();
	}
	
	public Grid entrance() {
		return src;
	}
	
	public Grid exit() {
		return dest;
	}
}
