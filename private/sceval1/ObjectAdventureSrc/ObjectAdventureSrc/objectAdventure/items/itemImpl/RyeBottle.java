package objectAdventure.items.itemImpl;

import objectAdventure.items.Item;

/**
 *
 * @author SteveJCevallos
 */
public class RyeBottle implements Item{

    /**
     * @return The item description.
     */
    @Override
    public String getItemDescription() {
        return "A bottle of Rye";
    }
    
    public String pickedUpItemDescription(){
        return "You picked up an cursed rye bottle";
    }

    public String droppedItemDescription(){
        return "You dropped  an cursed rye bottle";
    }
}
