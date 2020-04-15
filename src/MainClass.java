import heavy.DungeonMaster;
import sqcore.Chest;
import sqcore.Entity;
import sqcore.Region;

public class MainClass {

	public static void main(String[] args) {
		
		DungeonMaster DM = new DungeonMaster("Bruce");
		
		Region cave_map = new Region(DM,"Nashkel Mine");
		
		Chest chest = new Chest(DM);
		cave_map.receive(chest);
		
		Chest daryls_footlocker = new Chest(DM,"Daryl's footlocker");
		cave_map.receive(daryls_footlocker);
		
		Entity jewel = new Entity(DM,"jewel");
		chest.receive(jewel);
		
		Entity firestone = new Entity(DM,"firestone");
		daryls_footlocker.receive(firestone);
		
		firestone.explode();
	}
}
