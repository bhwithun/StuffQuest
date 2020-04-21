/**
 * 
 */
package com.brianandkathi.stuffquest;

import com.brianandkathi.sqcore.GOB;

/**
 * World - connects all the places you can go.
 * <p>
 * A world is not actually something you can walk around on, it is more like
 * a series of connections between the places you can walk.
 * 
 * @see Grid
 * @see GOB
 * 
 * @author brian
 *
 */
public class World extends GOB {

	/**
	 * 
	 */
	public World() {
		super();
	}
	
	public void dump() {
		super.dump();
		System.out.println("World:"+sqid);
	}

}
