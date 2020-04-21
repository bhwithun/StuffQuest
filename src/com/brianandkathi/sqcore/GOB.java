package com.brianandkathi.sqcore;

/**
 * GOB - Game OBject
 * <p>
 * Anything that exists within the game inherits from this game object
 * 
 * @author brian
 *
 */
public class GOB extends SQID {

	public GOB() {
		super();
	}

	public void dump() {
		super.dump();
		System.out.println("GOB:"+sqid);
	}
}
