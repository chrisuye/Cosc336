package objectAdventure.items.itemImpl;

import java.util.List;

import objectAdventure.items.Item;

public class Flashlight implements Item {
	
    boolean isAnchored = false;

    public String getItemAuthor() {
        return "Nicole Backert";
    }

    @Override
    public String getItemDescription() {
        return "A black aluminum flashlight. You flip the switch, but nothing happens. You notice the flashlight is relatively light so you check for batters. There are none.";
    }

    /** 
     * Item Can be picked up and moved.
     * 
     * @return  True
     */
    @Override
    public boolean isTransferable() {
        return !isAnchored;
    }

    @Override
    public List<String> getAliasList() {
        return List.of("Flashligh","Light");               
    }
}
