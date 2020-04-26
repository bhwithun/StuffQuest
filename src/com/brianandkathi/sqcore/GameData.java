package com.brianandkathi.sqcore;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author brian
 *
 */
public class GameData extends Database {

	public GameData() {
		// TODO Auto-generated constructor stub
	}

	public Grid LoadGrid(String name) {
		Grid grid = null;
		ResultSet rs=getResultSet("SELECT * FROM grid WHERE description='"+name+"'");
		if(rs!=null) {
			try {
				while(grid==null & rs.next()) {
					grid=new Grid(rs.getString("description"),rs.getString("uuid"));
				}
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		if(grid!=null) {
			System.out.println("Loading "+grid.toString());
			rs=getResultSet("SELECT * FROM portal WHERE entrance='"+grid.sqid.toString()+"'");
			if(rs!=null) {
				try {
					while(rs.next()) {
						grid.add_entrance(new Portal(grid,new Position(rs.getFloat("entrance_x"),rs.getFloat("entrance_y"))));
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return grid;
	}
	
}
