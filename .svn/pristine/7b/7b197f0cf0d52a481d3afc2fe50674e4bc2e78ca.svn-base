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
        return "A black aluminum flashlight. You flip the switch, but nothing happens. You notice the flashlight is relatively light so you check for batteries. There are none.";
    }
    
    @Override
    public String getEnchantedDescription() {
        return "A black aluminum flashlight. You flip the switch and the whole room is illuminated. It has no batteries, but can somehow work indefinitely.";
    }
    
    @Override
    public String getCursedDescription() {
        return "A black aluminum flashlight. You flip the switch and a light comes on causing any surface the light touches to decay immediately.";
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
