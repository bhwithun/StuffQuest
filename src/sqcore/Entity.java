package sqcore;

import java.util.UUID;

/**
 * @author brian
 *
 */
public class Entity {

	/** The Entity's dungeon master */
	IDM DungeonMaster;
	
	/** The Entity's globally unique identifier */
	UUID GUID;
	
	String myDescription;
	Entity myHolder;
	
	public Entity(IDM DM, String description) {
		DungeonMaster = DM;
		myDescription = description;
		GUID = UUID.randomUUID();
		DungeonMaster.handleCreation(this);
	}
	
	/**
	 * isProperNoun looks at the first letter of an entity's description.  If it is a
	 * capital letter, the Entity is presumed to be a proper noun (e.g. "Baldur's Gate")
	 * rather than a simple noun ("cave").
	 * 
	 * This lets the code be grammatically correct when describing it, for example:
	 *   "Player sees a rock"
	 *   "Player sees Baldur's Gate"  (do not use 'a')
	 *   
	 * @return true or false
	 */
	public boolean isProperNoun() {
		String firstLetter = myDescription.substring(0, 1);
		return firstLetter == firstLetter.toUpperCase();
	}
		
	public UUID getID() {
		return GUID;
	}
	
	public String getDescription() {
		if (isProperNoun()) return myDescription; // e.g. Player drops "Flail of Ages" (no 'a')
		return "a " + myDescription;              // e.g. Player drops "a rock"
	}
	
	public void enter(Entity holder) {
		DungeonMaster.handleEncasement(this,holder);
	}
	
	public Entity getHolder() {
		return myHolder;
	}
	
	public void explode() {
		DungeonMaster.handleExplosion(getHolder(),this);
	}

	public void setHolder(Entity holder) {
		myHolder = holder;
	}
}
