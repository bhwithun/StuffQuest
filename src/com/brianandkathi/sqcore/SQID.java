package com.brianandkathi.sqcore;

import java.sql.ResultSet;
import java.util.UUID;

/**
 * SQID - pronounced 'squid' is a StuffQuestID
 * <p>
 * Everything that can be directly referenced in the game is a squid and
 * it is referenced by this ID.
 * 
 * @author brian
 *
 */
public abstract class SQID implements IDump {

	protected UUID sqid;
	protected static Database database = new Database();

	public SQID() {
		sqid = UUID.randomUUID();
	}
	
	public SQID(String uuid) {
		sqid = UUID.fromString(uuid);
	}
	
	protected void echo(String message) {
		System.out.println(message);
	}
	
	@Override
	public String toString() {
		return sqid.toString();
	}

	public static void connect(String string) {
		database = new Database();
		database.connect("game.db");
	}

	public static Grid loadGrid(String name) {
		Grid grid = null;
		ResultSet rs=database.getResultSet("SELECT * FROM grid WHERE description='"+name+"'");
		if(rs!=null) {
			try {
				while(grid==null & rs.next()) {
					grid=new Grid(rs.getString("description"),rs.getString("uuid"));
				}
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		return grid;
	}
	
}
