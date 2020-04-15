package sqcore;

public class Chest extends Entity implements Holder {

	public Chest(IDM DM) {
		super(DM, "chest");
	}

	public Chest(IDM DM, String label) {
		super(DM, label);
	}

	@Override
	public void receive(Entity e) {
		DungeonMaster.handleEncasement(this, e);
	}
	
}
