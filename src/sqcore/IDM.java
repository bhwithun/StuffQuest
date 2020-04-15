package sqcore;

import java.util.UUID;

/**
 * IDM is the Interface for the Dungeon Master (DM).  All interactions between entities
 * happens by way of the DM.
 * 
 * If this game needs to work over a network, consider using JMS (Java Message Service)
 * https://www.oracle.com/technical-resources/articles/java/intro-java-message-service.html
 * 
 * @author brian
 */

public interface IDM {

	String getName();

	void handleExplosion(Entity holder, Entity item);
	void handleEncasement(Entity holder, Entity item);
	void handleCreation(Entity entity);
}
