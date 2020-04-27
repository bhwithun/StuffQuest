/**
 * 
 */
package com.brianandkathi.sqcore;

/**
 * @author brian
 *
 */
public class Portal extends GOB {

	public Portal(Grid grid, Position position) {
		super("Portal",grid,position);
	}

	@Override
	public void dump() {
		echo(toString());
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
