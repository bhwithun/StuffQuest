package sqcore;

public class Region extends Entity implements Holder {

	private String myName;
	
	public Region(IDM DM, String label) {
		super(DM,label);
		myName = label;
		System.out.println(DM.getName() + " has " + getTitle());
	}
	
	public String getTitle() {
		return myName;
	}

	@Override
	public void receive(Entity e) {
		DungeonMaster.handleEncasement(this, e);
	}

}
