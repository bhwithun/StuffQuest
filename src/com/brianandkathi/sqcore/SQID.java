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
public class SQID {

	protected UUID sqid;

	public SQID() {
		sqid = UUID.randomUUID();
	}

	public void dump() {
		System.out.println("SQID:"+sqid);
	}
}
