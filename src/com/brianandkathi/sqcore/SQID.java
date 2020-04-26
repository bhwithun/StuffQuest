package com.brianandkathi.sqcore;

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

}
