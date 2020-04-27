/**
 * 
 */
package com.brianandkathi.sqcore;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

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

	protected String description;
	protected ArrayList<GOB> gobs;
	
	public Grid(String description, String uuid) {
		super(uuid);
		this.description = description;
		gobs = new ArrayList<GOB>();
		gobs.add(new Item("Rock",this,new Position(.144,.72)));
	}
	
	@Override
	public String toString() {
		return description;
	}
	
	@Override
	public void dump() {
		echo(description);
		for(GOB gob: gobs) {
			echo("   "+gob.toString());
		}
	}

	/**
	 * Causes the Grid to load all of the game objects located inside it
	 */
	public void loadGameObjects() {
		loadPortals();
	}

	private void loadPortals() {
		ResultSet rs=database.getResultSet("SELECT * FROM portal, placement WHERE placement.grid_uuid = '"+sqid+"' AND placement.object_uuid = portal.uuid;");
		if(rs!=null) {
			try {
				while(rs.next()) {
					Portal portal = new Portal(this,new Position(rs.getFloat("xloc"),rs.getFloat("yloc")));
					gobs.add(portal);
				}
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
}
