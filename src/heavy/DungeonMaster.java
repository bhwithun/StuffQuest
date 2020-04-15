package heavy;
import sqcore.Entity;
import sqcore.IDM;

public class DungeonMaster implements IDM {

	private String myName;
	
	public DungeonMaster(String name) {
		myName = name;
		System.out.println("I am " + getName());
	}

	@Override
	public String getName() {
		return myName;
	}

	@Override
	public void handleExplosion(Entity holder, Entity item) {
		if (holder==null) {
			System.out.println(item.getDescription() + " explodes");
		} else {
			System.out.println(item.getDescription() + " explodes inside " + holder.getDescription());
			// TODO: check holder's hit points / damage counter
			holder.explode();
		}
	}

	@Override
	public void handleEncasement(Entity holder, Entity item) {
		System.out.println(item.getDescription() + " enters " + holder.getDescription());
		item.setHolder(holder);
	}

	@Override
	public void handleCreation(Entity item) {
		System.out.println(item.getDescription() + " is created");
	}

}
